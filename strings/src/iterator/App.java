package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		///Old iterator. Does it still have a purpose in the new world?
		Iterator<String> it = animals.iterator();
		
		
		while(it.hasNext()) {
		String value = it.next();
		System.out.println(value);
		
			if(value.equals("cat")) {
				it.remove();
			}
		}
		
		System.out.println("\n");
		////Modern iteration, Java 5 and later. 
		
		for(String animal: animals) {
			System.out.println(animal);
		}
	}
}
