package equal;

public class App {
	public static void main(String[] args) {
		
		
		Person person1 = new Person(5, "Artie");
		Person person2 = new Person(5, "Artie");
		
		
		
		System.out.println(person1.equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1 == value2);
		
		Integer number1 = 6;
		Integer number2 = 6;
		
		System.out.println(number1 == number2);
		
		String text1 = "Hello";
		String text2 = "Hello".substring(0,5);
		
		System.out.println(text2);
		
		System.out.println(text1 == text2);
	}
}
