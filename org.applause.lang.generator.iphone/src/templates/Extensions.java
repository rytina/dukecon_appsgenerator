package templates;

import java.util.ArrayList;
import java.util.List;

import org.applause.lang.applauseDsl.ViewCall;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

public class Extensions {
	
	public static EObject getRootContainer(EObject obj) {
		EObject result = EcoreUtil2.getRootContainer(obj);
		return result;
	}
	
	public static List<ViewCall> allViewCalls(EObject ctx){
		return allElementsOfType(ctx, ViewCall.class);
	}
	
	public static <T extends EObject> List<T> allElementsOfType(EObject ctx, Class<T> type) {
		List<T> result = new ArrayList<T>();
		TreeIterator<EObject> iter = ctx.eResource().getAllContents();
		while(iter.hasNext()){
			EObject next = iter.next();
			if(type.isInstance(next)){
				result.add((T)next);
			}
		}
		return result;
	}
}
