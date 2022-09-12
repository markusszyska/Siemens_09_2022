package pak03_functional;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.swing.JButton;

class Controller {

	
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		
		switch(actionCommand) {
			case "BTNSTART":
			
		}
	}
	
	public static void startPressed(ActionEvent e) {
		
	}
	
	
}

public class Demo02_Methodenreferenzen {
	public static void main(String[] args) {
		ActionListener al = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
		
		JButton btn = new JButton();
		btn.setActionCommand("BTNSTART");
		
		btn.addActionListener(al);
		
		btn.addActionListener(Demo02_Methodenreferenzen::goStatic);
		
		List<Integer> list = List.of(1,2,3,4);
		
		//Referenz auf eine statische Methode
		list.forEach(Demo02_Methodenreferenzen::gebeElementeAus);
		
		list.forEach(System.out::println);
		
		//void accept(T t);
		Consumer<Object> con = System.out::println;
		
		
		Demo02_Methodenreferenzen dm = new Demo02_Methodenreferenzen();
		
		//Referenz auf eine Instanzmethode
		btn.addActionListener(dm::goNonStatic);
		
		//Referenz auf einen Konstruktor
		Supplier<String> sup = String::new;		
		String s = sup.get();
		
		Function<String, String> func = String::new;
		
		
	}
	
	public static void goStatic(ActionEvent event) {
		
	}
	public void goNonStatic(ActionEvent event) {
		
	}
	public static void gebeElementeAus(Object o) {
		System.out.println(o);
	}
	
}
