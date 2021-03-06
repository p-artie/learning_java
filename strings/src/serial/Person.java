package serial;

import java.io.Serializable;

public class Person implements Serializable {


	private static final long serialVersionUID = 8666152311985535822L;
	
	//instance variables
	private transient int id;
	private String name;
	
	//static variables are serializable
	private static int count;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id = " + id + ", name = " + name + "] Count is: " + count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
