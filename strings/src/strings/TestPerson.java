package strings;

public class TestPerson {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Artie";
		person1.age = 36;
		
		Person person2 = new Person();
		person2.name = "Lynn";
		person2.age = 35;
		
		person1.sayName();
		person2.sayName();
		person1.sayHello();

	}
} 
