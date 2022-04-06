package strings;

public class Person {
	
	private String name;
	private int age;
	
	void sayName() {
		System.out.println("My name is " + name + " and I am " + age + " years old."  );
	}
	
	void sayHello() {
		System.out.println("Hello there");
	}
	
	int calculateYearsToRetire() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	void setAge(int ageOf) {
		age = ageOf;
	}
	
	int getAge() {
		return age;
	}
}

