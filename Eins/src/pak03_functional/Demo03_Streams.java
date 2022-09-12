package pak03_functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Kreis{
	int radius;
	
	Kreis(String radius){
		this.radius=radius.length();
	}

	@Override
	public String toString() {
		return "Kreis radius=" + radius + "";
	}
	
}

public class Demo03_Streams {
	public static void main(String[] args) {

//		demo01();
//		demo02Map();
		demo03Collect();
	}

	private static void demo03Collect() {
		Stream<Integer> myStream01 = Stream.of(99, 99, 99, 99, 77, 66, 55, 1, 2, 3, 9, 78, 98, 777,123456);
		
		Supplier<List<Integer>> supplier = ArrayList::new;
		
		BiConsumer<List<Integer>, Integer> accumulator = List::add;
		
		BiConsumer<List<Integer>, List<Integer>> combiner= List::addAll;
		
		List<Integer> result = myStream01.collect(supplier, accumulator, combiner);
//		result.forEach(System.out::println);
		
		Stream<Integer> myStream02 = Stream.of(99, 99, 99, 99, 77, 66, 55, 1, 2, 3, 9, 78, 98, 777,123456);
		Set<Integer> result2 = myStream02.collect(HashSet::new, HashSet::add, HashSet::addAll);
		System.out.println(result2);
		
		Stream<Integer> myStream03 = Stream.of(99, 99, 99, 99, 77, 66, 55, 1, 2, 3, 9, 78, 98, 777,123456);
		
	
	
	}

	private static void demo02Map() {
		Function<String, Integer> mapper = String::length;
		BiFunction<String, String, Integer> bif;
		
		Stream.of("Hallo", "Welt","hier", "ist", "Java").map(Kreis::new).forEach(System.out::println);

	}

	private static void demo01() {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Stream<Integer> stream = list.stream();

//		stream.skip(2).filter(i->i%2==0);
//		stream.forEach(System.out::print);

//		stream= stream.skip(2).filter(i->i%2==0);
//		stream.forEach(System.out::print);

		Stream.of("Jan", "Feb", "Maerz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November",
				"Dezember", null).skip(4).filter(s -> s != null).limit(3).forEach(System.out::println);

	}

	public static String dreheStringUm(String s) {
		String neu = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			neu += s.charAt(i);
		}
		return neu;
	}
}
