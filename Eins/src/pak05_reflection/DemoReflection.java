package pak05_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {
	public static void main(String[] args) throws Exception{
		Class<Person> persClass = Person.class;
		
		Field[] fields = persClass.getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			System.out.println( i + ": " +fields[i].getName());
		}
		
		Person p = new Person("Max", "Mustermann", 20);
		fields[2].setInt(p, 100);
		
		System.out.println(p.age);
		
		fields[1].setAccessible(true);
		fields[1].set(p, "Name geaendert");
		
		System.out.println(p.getLastname());
		
		
		System.out.println("-----------------");
		Method[] methods = persClass.getDeclaredMethods();
		for(Method m : methods) {
			if(m.getName().equals("privateMethod")) {
				m.setAccessible(true);
				m.invoke(p, null);
			}
		}
		
		
		
	}
}
