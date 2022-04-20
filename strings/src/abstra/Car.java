package abstra;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("Starting Car. Wrooom!");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in car");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Shutting down... car...");
		
	}

}
