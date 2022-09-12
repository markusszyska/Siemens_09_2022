package pak05_reflection;

public class Person {
	public String firstname;
	private String lastname;
	public int age;
	
	
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	private void privateMethod() {
		System.out.println("Hier kommt keiner ran");
	}
	
}
