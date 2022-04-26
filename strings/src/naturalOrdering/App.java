package naturalOrdering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();
		
		addElements(list);
		addElements(set);
		
		System.out.println(list);
		System.out.println(set);
		
		Collections.sort(list);
		
		System.out.println("\n");
		showElements(list);
		System.out.println();
		showElements(set);
		
	}
	
	public static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliette"));
		col.add(new Person("Clare"));
		col.add(new Person("Artie"));
	}
	
	public static void showElements(Collection<Person> col) {
		for(Person element: col) {
			System.out.println(element);
		}
	}
	
}
