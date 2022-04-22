package list;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//Retrieving
		System.out.println(numbers.get(0));
		
		//Indexed for loop itiration
		System.out.println("\nIteration #1");
		for(int i=0;i <numbers.size();i++) {
			
			System.out.println(numbers.get(i));
		}
		
		//Removing items (careful!)
		numbers.remove(numbers.size() -1);

		//Removing items from the front. Very SLOW
		numbers.remove(0);
		
		//Modern iteration for ArrayList
		System.out.println("\nIteration #2");
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		//List interface....
		List<String> value = new ArrayList<String>(); 
		
	}

}
