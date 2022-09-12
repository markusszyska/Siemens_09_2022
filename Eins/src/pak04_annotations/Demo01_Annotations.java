package pak04_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface PluginVersion{
	int minor();
	int major();
}

@PluginVersion(minor= 1, major=3)
class MyPlugIn{
	
}

public class Demo01_Annotations {
	public static void main(String[] args) {
		PluginVersion vers = MyPlugIn.class.getAnnotation(PluginVersion.class);
		if(vers.major() < 2) {
			System.out.println("Plugin zu alt!");
		}
		
	}
}
