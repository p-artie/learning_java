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
	}
}