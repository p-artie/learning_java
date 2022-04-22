package serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person[] people = {new Person(1, "Sue"), new Person(2, "Artie"), new Person(3, "Lynn")};
		
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
			
			
			Person.setCount(88);
			os.writeObject(people);
			
			os.writeObject(peopleList);
			
			os.writeInt(peopleList.size());
			
			for(Person person: peopleList) {
				
				//Trying to set Id to 10 so that then when I read the object I know that I'm actually reading what I'm writing... but the object id is written as the orignal value instead of the value I mark
				person.setId(10);
				os.writeObject(person);
				System.out.println(person);
				
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
