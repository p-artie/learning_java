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
}
}