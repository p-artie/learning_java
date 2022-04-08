package strings;

public class Fan {
	private int id;
	private String name;
	
	public Fan(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		//Create StringBuilder object and append id and name instance variable values
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		
		return sb.toString(); 
	}
}
