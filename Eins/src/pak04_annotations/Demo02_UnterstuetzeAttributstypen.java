package pak04_annotations;

enum MyEnum{
	A,B,C
}

@interface Anno02{
	//primitive DT
	int i();
	
	double d();
	
	//nur wenige Referenztypen
	String s();
	
	Class<?>c();
	
	MyEnum me();
	
	PluginVersion p();
	
//	Object o();
	
	String[] arr();
	
}

public class Demo02_UnterstuetzeAttributstypen {

}
