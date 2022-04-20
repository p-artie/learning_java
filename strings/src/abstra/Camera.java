package abstra;

public class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Starting Camera. Snap");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff with Camera...");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Shutting down, camera?????");
		
	}

}
