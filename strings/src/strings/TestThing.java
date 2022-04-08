package strings;

public class TestThing {
	public static void main(String[] args) {
		Thing.description = "I am a thing class";
		
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		System.out.println("After I created the objects, my count is: " + Thing.count);
	}
}
