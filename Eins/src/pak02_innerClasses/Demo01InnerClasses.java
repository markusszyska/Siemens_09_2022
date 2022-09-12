package pak02_innerClasses;

import java.util.Arrays;
import java.util.List;

public class Demo01InnerClasses {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		Outer.StaticInnerClass sic = new Outer.StaticInnerClass();
		
		Outer.Inner i = new Outer().new Inner();
		
		Integer[] ints = {1,2,3,4};
		
		List<Integer> list = Arrays.asList(ints);
		
		list.forEach(System.out::println);
		
		list.add(5);
		
		
	}
}

class Outer{
	String text = "";
	
	static class StaticInnerClass{
//		public String getText() {
//			return text;
//		}
	}
	class Inner{
		public String getText() {
			return text;
		}
	}
	void go() {
		Inner i= this.new Inner();
		StaticInnerClass sic = new StaticInnerClass();
	}
}