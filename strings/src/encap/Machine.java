package encap;

public class Machine {
	public void start() {
		System.out.println("Machine started...");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Photo taken!");
	}
}


