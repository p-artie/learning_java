package generic;

public class Camera extends Machine{

	@Override
	public String toString() {
		return "I'm a Camera man!";
	}
	
	public void snap() {
		System.out.println("Taking photo...");
	}

}
