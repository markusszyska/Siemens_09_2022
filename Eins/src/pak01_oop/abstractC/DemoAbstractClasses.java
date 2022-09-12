package pak01_oop.abstractC;

public class DemoAbstractClasses {
	public static void main(String[] args) {
		Tier t = new Kuh();
	}
}

abstract class Tier {
	public abstract void laufen();
}

class Kuh extends Tier {
	@Override
	public void laufen() {
		System.out.println("Bla");	
	}

}
