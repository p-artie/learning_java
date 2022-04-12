package strings;

public class Car extends Madoo{
	
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I ain't stopping for no body!");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield...");
	}
	
	public void showInfo() {
		System.out.println("Car type: " + name);
	}
}
