package strings;

public class Thing {
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	public static String description;
	public static int count = 0;
	
	public Thing() {
		count++;
	}
	
	
	public void showName() {
		System.out.println(description + ": " + name);
	}
	
	public static void showInfo() {
		System.out.println(description);
	}
	
}
