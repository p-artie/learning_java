package enume;

public enum Animals {
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	
	private String name;
	
	Animals(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//override toString even though eclipse does not create it if asked nicely
	public String toString() {
		return "This animal is called: " + name;
	}
}
