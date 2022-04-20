package inner;

public class App {
	public static void main(String[] args) {
		
		Robot robot = new Robot(7);
		
		robot.start();
		
		//You can even use the inner class outside of the Class if you mark it as public using this syntax. 
		//Robot.Brain brain = robot.new Brain();
		//brain.think();
		
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
