package encap;

public class TestMachine {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting
		Machine machine2 = camera1;
		
		machine2.start();
		machine2.snap();
		
	}
}
