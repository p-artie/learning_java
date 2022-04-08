package strings;

public class Machine {
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0);
		System.out.println("Constructor running...");
		
	}
	
	public Machine(String name) {
		this(name, 0);
		System.out.println("Second constructor running...");
		this.setName(name);
	}
	
	public Machine(String name, int code) {
		this.setName(name);
		this.setCode(code);
		
		System.out.println("Third constructor running...");
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
