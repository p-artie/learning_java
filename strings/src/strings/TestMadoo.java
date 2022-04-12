package strings;

public class TestMadoo {
	public static void main(String[] args) {
		Madoo madoo1 = new Madoo();
		
		madoo1.start();
		
		Car car1 = new Car();
		car1.start();
		car1.wipeWindShield();
		
		car1.stop();
	}
}
