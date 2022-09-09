package oop;

import java.util.ArrayList;
import java.util.List;



public class DemoVererbung {
	public static void main(String[] args) {
//		//Kompilierzeit     / Laufzeit
//		Object objIsSchwein = new Schwein();
//		Tier tierIstSchwein = new Schwein();
//		Schwein schweinIstSchwein = new Schwein();
//		
//		objIsSchwein.toString();
//		tierIstSchwein.laufen();
//		schweinIstSchwein.laufen();
//		
//		//objIsSchwein soll Laufen
//		((Tier)objIsSchwein).laufen();
//		Tier t1 = (Tier)objIsSchwein;
//		
//		Tier tierIstTier = new Tier();
//		tierIstTier = new Schwein();
//		Schwein s = (Schwein)tierIstTier;
//		
//		//Casting
//		
//		//Upcast
//		Tier t = new Schwein();
//		//Downcast
//		Schwein s1 =(Schwein)t;

		Tier t3 = new Schwein();
		t3.laufen();
		Tier t4 = new Kuh();
		t4.laufen();

		go(new Schwein());
		go(new Kuh());

		List<Tier> list = new ArrayList<>();
		list.add(new Kuh());
		
		Schwein s = new Schwein();
		s.fressen(new Stein());
		s.fressen(new Kartoffel());
		s.fressen(new Moehre());
		
		Fressbar f1 = new Moehre();
	}

	static void go(Tier k) {
		k.laufen();
	}

}
interface Fressbar{
	void wirdGegessen();
}
class Stein implements Fressbar{

	@Override
	public void wirdGegessen() {
		System.out.println("Stein wird gegessen");
	}
	
}

class Tier {
	String name;

	public void laufen() {
		System.out.println("Tier laeuft");
	}

	public Tier() {
		this("Standardname");
//		System.out.println("Konstruktor von Tier");
	}

	public Tier(String name) {
		this.name = name;
	}

}

class Schwein extends Tier {
	public Schwein() {
		super("Frederik");
//		System.out.println("Konstruktor von Schwein");
	}
	
	
	public void laufen() {
		System.out.println("Schwein laeuft");
	}

	public void fressen(Fressbar g) {
		g.wirdGegessen();
	}
}

class Kuh extends Tier {
	public void laufen() {
		System.out.println("Kuh laeuft");
	}
}

class Gemuese {
	void wirdgegessen() {

	}
}

class Moehre extends Gemuese implements Fressbar{
	int ruebenlaenge = 10;
	public void wirdGegessen() {
		this.ruebenlaenge--;
		System.out.println("Moehre wird gegessen");
	}
}

class Kartoffel extends Gemuese implements Fressbar {
	int knollengroesse = 10;
	public void wirdGegessen() {
		knollengroesse--;
		System.out.println("Kartoffel wird gegessen");
	}
}