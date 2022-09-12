package pak04_annotations;

@interface Anno04{
	String value();
	int i() default 0;
}

@Anno04("")
public class Demo04Value {

}
