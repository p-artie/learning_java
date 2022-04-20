package inner;

public class Robot {
	private int id;
	
	//Inner public class
	public class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	//Inner static class
	static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
	}
	
	final String name = "Robert";
	
	class Temp {
		public void doSomething() {
			System.out.println("Id is: " + id);
			System.out.println("My name is " + name);
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	

}
