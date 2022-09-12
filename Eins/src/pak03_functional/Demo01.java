package pak03_functional;

import java.util.List;
import java.util.function.Consumer;

interface Func01{
	int berechne(int i, int i2);
}


public class Demo01 {
	public static void main(String[] args) {
		//Pre Java
		Func01 f1 = new Func01() {			
			@Override
			public int berechne(int i, int i2) {				
				return 0;
			}
		};
		Func01 f2 = (int i, int i2)-> {return 0;};
		
		Func01 f3 = (i, i2)-> i+i2;
		int erg = f3.berechne(10, 10);
		
		List<Integer> list = List.of(1,2,3,4);
		
		list.forEach(wert->System.out.println(wert));
		
		
		
	}
}
