package strings;

public class TestPerson {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		
		Person person2 = new Person();
		
		person1.sayName();
		person2.sayName();
		person1.sayHello();
		person1.setAge(36);
		
		int years = person1.calculateYearsToRetire();

		System.out.println(years);
		
		int age = person1.getAge();
		
		System.out.println(age);
		
	}
} 
