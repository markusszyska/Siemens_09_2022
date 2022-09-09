package oop.pak1;

public class App {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.name); //

		B b = new B();
		System.out.println(b.name);
		
		b.setName("Name geaendert");
		System.out.println(b.name);   //
		System.out.println(b.getName());
	}
}

class A {
	String name = "A";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class B extends A {
	String name = "B";
}
