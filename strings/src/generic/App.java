package generic;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		
		/////////////////Before Java 5///////////////////
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		///////After Java 5///////////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		
		// Can have more than one type of argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/// Java 7, Java will infer the object type based on the object in the reference variable argument. 
		
		ArrayList<Integer> someList = new ArrayList<>();
		
		
		
		
	}
}
