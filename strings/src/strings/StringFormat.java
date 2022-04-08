package strings;

public class StringFormat {
	public static void main(String[] args) {
		
		// No bueno code...
		String info = "";
		
		info += "My name is Artie.";
		info += " ";
		info += "I am a software engineer.";
		
		System.out.println(info);
		
		// Bueno code
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb);
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger.")
		.append(" ")
		.append("I'm a skydiver.");
		
		System.out.println(s);
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		
		for(int i=0; i<20; i++) {
			System.out.printf("%-2d: some text here\n", i);
		}
		
		System.out.printf("Total value: %.2f\n", 5.6789);
		System.out.printf("Total value: %5.1f\n", 365.178989);
	}
}