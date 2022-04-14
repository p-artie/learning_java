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
		// Won't because machine does not have a snap method defined. machine2.snap();
		
		// Downcasting
		
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.snap();
		
		// Wont work --- runtime error. Downcasting error. 
		Machine machine4 = new Machine();
		Camera camera3 = (Camera) machine4;
		// camera3.start();
		
	}
}
