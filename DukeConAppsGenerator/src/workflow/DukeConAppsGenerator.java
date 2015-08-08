package workflow;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;

import org.apache.commons.io.FileUtils;
import org.applause.lang.applauseDsl.ApplauseModel;
import org.applause.lang.applauseDsl.Application;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.FileHandleImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xpand2.output.VetoException;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.resource.XtextResourceSet;

public class DukeConAppsGenerator {

	private static final String GENERATED_APPS_FOLDER = "../generated-apps";
	private static final String TEMPLATE_PROJECT_FOLDER_NAME = "templateproject/ConApp";

	static {
		org.applause.lang.ApplauseDslStandaloneSetup.doSetup();
	}

	/**
	 * @param args
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public static void main(String[] args) throws URISyntaxException,
			IOException {
		final File appsFolder = cleanupOutputDirectory(GENERATED_APPS_FOLDER);
		copyTemplateProjectsTo(appsFolder);
		copyResourceTo(appsFolder);
		XtextResourceSet resourceSet = new XtextResourceSet();
		File file = new File(DukeConAppsGenerator.class.getResource(
				"../model/ConApp.applause").toURI());
		Resource resource = resourceSet.getResource(
				URI.createFileURI(file.getAbsolutePath()), true);
		ApplauseModel model = (ApplauseModel) resource.getContents().get(0);

		OutputImpl output = new OutputImpl();
		Outlet outlet = createOutlet(appsFolder);
		output.addOutlet(outlet);

		generate(model.getApplication(), output);

	}

	private static void copyResourceTo(File appsFolder) throws IOException, URISyntaxException {
		File imagesIOS = new File(DukeConAppsGenerator.class.getResource(
		"../Images/iOS").toURI());
		File imagesDestDir = new File(appsFolder, "iOS/ConApp/ConApp/Images");
		FileUtils.copyDirectory(imagesIOS, imagesDestDir);
		File[] iOSImages = imagesDestDir.listFiles();
		for (File file : iOSImages) {
			file.renameTo(new File(imagesDestDir, file.getName().replace(".png", "@2x.png")));
		}
		
		File imagesAndroid = new File(DukeConAppsGenerator.class.getResource(
		"../Images/Android").toURI());
		FileUtils.copyDirectory(imagesAndroid, new File(appsFolder, "Android/ConApp/res/drawable-hdpi"));
	}

	private static void copyTemplateProjectsTo(File generatedAppsFolder) throws URISyntaxException, IOException {
java.net.URL prjPath = templates.Extensions.class.getResource("/" + TEMPLATE_PROJECT_FOLDER_NAME);
System.out.println(prjPath);

java.net.JarURLConnection connection = (java.net.JarURLConnection) prjPath.openConnection();
java.util.jar.JarFile file = connection.getJarFile();
java.util.Enumeration<java.util.jar.JarEntry> entries = file.entries();
while (entries.hasMoreElements()) {
    java.util.jar.JarEntry e = entries.nextElement();
if (e.getName ().startsWith (e.getName ())){
    System.out.println ( e.getName());
}
}

/**		File iOStemplateProject = new File(prjPath);
		FileUtils.copyDirectoryToDirectory(iOStemplateProject, new File(generatedAppsFolder, "iOS"));
**/
	}

	private static Outlet createOutlet(final File directory) throws IOException {
	
		final Outlet outlet = new Outlet() {
			@Override
			public FileHandle createFileHandle(String qualifiedName)
					throws VetoException {
				File outputDirectory = null;
				if(isForiOS(qualifiedName)){
					outputDirectory = new File(directory, "iOS/ConApp/ConApp/Generated");
				}else if(isForAndroid(qualifiedName)){
					outputDirectory = new File(directory, "Android/ConApp/Generated");
				}
				return new FileHandleImpl(this, new File(outputDirectory, qualifiedName));
			}

		};
		return outlet;
	}


	private static boolean isForAndroid(String qualifiedName) {
		return qualifiedName.endsWith(".java");
	}

	private static boolean isForiOS(String qualifiedName) {
		return qualifiedName.endsWith(".m") || qualifiedName.endsWith(".h"); 
	}
	
	private static File cleanupOutputDirectory(final String folder)
			throws IOException {
		final File directory = new File(folder);
		if (directory.exists()) {
			if (directory.isDirectory()) {
				FileUtils.cleanDirectory(directory);
			}else{
				directory.delete();
			}
		}
		directory.mkdir();
		return directory;
	}

	public static void generate(Application app, Output output) {
		System.out.println("Generating code for app project " + app.getName());
		XpandExecutionContextImpl ctx = new XpandExecutionContextImpl(output,
				null, Collections.<String, Variable> emptyMap(), null, null);

		ctx.registerMetaModel(new JavaBeansMetaModel());
		try {
			XpandFacade.create(ctx).evaluate("templates::Main::main", app);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
