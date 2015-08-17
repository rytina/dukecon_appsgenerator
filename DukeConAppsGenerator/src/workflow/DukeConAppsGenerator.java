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
				URI.createURI("archive:file:./bin/DukeConAppsGenerator.jar!/model/ConApp.applause"), true);
		ApplauseModel model = (ApplauseModel) resource.getContents().get(0);

		OutputImpl output = new OutputImpl();
		Outlet outlet = createOutlet(appsFolder);
		output.addOutlet(outlet);

		generate(model.getApplication(), output);

	}

	private static void copyResourceTo(File appsFolder) throws IOException, URISyntaxException {
		
		File imagesDestDir = new File(appsFolder, "iOS/ConApp/ConApp/Images");

java.net.URL url = DukeConAppsGenerator.class.getResource(
		"/Images");
java.net.JarURLConnection connection = (java.net.JarURLConnection) url.openConnection();
java.util.jar.JarFile jar = connection.getJarFile();

copyJarPathToDirectory(jar, "Images/iOS", imagesDestDir);
		File[] iOSImages = imagesDestDir.listFiles();
		for (File file : iOSImages) {
			file.renameTo(new File(imagesDestDir, file.getName().replace(".png", "@2x.png")));
		}
		
 imagesDestDir = new File(appsFolder, "Android/ConApp/res/drawable-hdpi");

copyJarPathToDirectory(jar, "Images/Android", imagesDestDir);
	}

	private static void copyTemplateProjectsTo(File generatedAppsFolder) throws URISyntaxException, IOException {
java.net.URL url = DukeConAppsGenerator.class.getResource(
		"/Images");

File iosOutput = new File(generatedAppsFolder, "iOS");

java.net.JarURLConnection connection = (java.net.JarURLConnection) url.openConnection();
java.util.jar.JarFile file = connection.getJarFile();

copyJarPathToDirectory(file, TEMPLATE_PROJECT_FOLDER_NAME, iosOutput);


/**		File iOStemplateProject = new File(prjPath);
		FileUtils.copyDirectoryToDirectory(iOStemplateProject, new File(generatedAppsFolder, "iOS"));
**/
	}

  private static void copyJarPathToDirectory (java.util.jar.JarFile jar, String pathInJar, File destinationDir) throws IOException{

java.util.Enumeration<java.util.jar.JarEntry> entries = jar.entries();
while (entries.hasMoreElements()) {
    java.util.jar.JarEntry e = entries.nextElement();

if (e.getName ().startsWith (pathInJar)){
    System.out.println ( e.getName());
    String outputName = e.getName().replace (pathInJar, "");
    File outputFile = new File (destinationDir, outputName);
    if(e.isDirectory()){
      outputFile.mkdir ();
      continue; 
    }
    java.net.URL url = templates.Extensions.class.getResource("/" + e.getName());
    FileUtils.copyURLToFile(url, outputFile);
}
}
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
