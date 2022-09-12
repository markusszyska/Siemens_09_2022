package pak01_oop;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass {
	
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Markus";
		
		Person p2 = new Person("Christian");
				
		p.sayHello();
		p2.sayHello();
		
		Person.go();
		
		byValue(p);
		System.out.println(p.name);
		
		int wert = 10;
		byValue(wert);
		System.out.println(wert);
		
		p.p=p;
		System.out.println(p.p.p.p.p.p.p.p.p.p.p.p.name);
	}
	
	public static void byValue(int param) {
		param++;
	}
	
	public static void byValue(Person p) {
		p = new Person();
		p.name = "Name geaendert"; 
	}
}

class Person{
	//Attribute
	String name;
	Person p;
	static int anzPersonen = 0;
	
	//Konstruktoren
	public Person() {
		Person.anzPersonen++;
	}
	
	public Person(String name) {
		Person.anzPersonen++;
		this.name = name;
	}
		
	//Methoden
	public void sayHello() {
		System.out.println(this.name + " Hallo");
	}
	
	public void sayHelloToOtherPerson(Person param) {
		System.out.println(this.name + " sagt hallo zu " + param.name);
	}
	
	public static void go() {
		System.out.println(anzPersonen);
	}
	

}
