package strings;

public class TestRobot {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.speak("Hi I'm Sam.");
		robot.jump(7);
		robot.move("North", 200);
		
		String greeting = "Hello there";
		robot.speak(greeting);
		
		int value = 14;
		
		robot.jump(value);
	}
}
