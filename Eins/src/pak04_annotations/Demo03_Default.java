package pak04_annotations;

@interface Anno03{
	int i() default 10;
}

@Anno03  //i=10
public class Demo03_Default {

}
@Anno03(i=20) //i = 20
class B{
	
}