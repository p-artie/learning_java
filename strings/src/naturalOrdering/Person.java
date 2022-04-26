package naturalOrdering;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person person) {
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2) {
			return 1;
		} 
		
		else if (len1 < len2) {
			return -1;
		}
		
		return name.compareTo(person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
