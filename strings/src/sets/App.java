package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		//Hashset does not retain order. Good to remember. and dont rely on the HashSet's.
		//Set<String> set1 = new HashSet<String>();

		//LinkedHashset does retain order. As you put the items in the set, that is how they are stored. 
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet sorts in a natural order. Strings is alphabetical. Numbers will sorted numerically. 
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty at start.. ");
		}

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		// Adding duplicate items
		set1.add("mouse");

		System.out.println(set1);

		//////Iteration
		
		for(String element: set1) {
			System.out.println(element);
		}
		///Does set contain a given item?////
		
		if(set1.contains("aardvark")) {
			System.out.println("contains aardvark");
		} else {
			System.out.println("Set does not contain aardvark...");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Set contains the string cat.");
		}
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty at end.");
		}
		
		///Intersection///
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		System.out.println("---Intersection---");
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);
	}
}
