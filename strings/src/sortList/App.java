package sortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		//Sorting Strings////
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("make");
		animals.add("mongoose");
		
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		////Sorting numbers/////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(72);
		numbers.add(40);
		numbers.add(57);
		numbers.add(22);
		
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer arg0, Integer arg1) {
				return -arg0.compareTo(arg1);
			}
		});
		
		System.out.println("---Numbers---");
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		////Sorting objects/////
		
		System.out.println("---------Sorting objects---------");
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(4, "Clair"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(2, "Sue"));

		Collections.sort(people, new Comparator<Person>() {

			//Sort by id8
			public int compare(Person p1, Person p2) {
				if(p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		for(Person person: people) {
			System.out.println(person);
		}
		
		System.out.println("\n");
		
		Collections.sort(people, new Comparator<Person>() {

			//Sort by name
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		for(Person person: people) {
			System.out.println(person);
		}
		
	}
}
