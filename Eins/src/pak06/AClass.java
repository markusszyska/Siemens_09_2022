package pak06;

import java.util.ArrayList;
import java.util.List;

public class AClass {
	public static void main(String[] args) {
		List<Blatt> list = new ArrayList<>();
		Blatt b = new Blatt(1);
		list.add(b);
		Baum baum = new Baum();
		Blatt b1 = baum.getBlaetter().get(0);
		
		
		
		
	}
}


class Baum{
	List<Blatt> blaetter = new ArrayList<>();

	public List<Blatt> getBlaetter() {
		List<Blatt> returnValue = new ArrayList<>();
		return returnValue;
	}

	private void setBlaetter(List<Blatt> blaetter) {
		this.blaetter = blaetter;
	}
	
	public void addBlatt(int id) {
		this.getBlaetter().add(new Blatt(id));
	}
	
	public Baum() {
		this.setBlaetter(new ArrayList<>());
	}
	
	
}

class Blatt{
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Blatt(int id) {
		this.setId(id);
	}
}