package pak04_annotations.methodenAnnotationen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Anno{
	int i();
	String s();
}


public class Demo01 {
	
	public static void main(String[] args) throws Exception {
		Demo01 d = new Demo01();
		d.go();
	}
	
	@Anno(i=1, s = "Hallo")
	public void go() throws Exception {
		int wert = this.getClass().getMethod("go").getAnnotation(Anno.class).i();
		System.out.println(wert);
	}
	
}


