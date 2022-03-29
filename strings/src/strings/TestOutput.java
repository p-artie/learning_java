package strings;

public class TestOutput {

	public static void main(String[] args) {
		TestOutput o = new TestOutput();
		
		o.go();
	}
		void go() {
			int y = 7;
			for (int x = 1; x < 8; x++) {
				y++;
				if (x > 4) {
					System.out.println(++y + " ");
				}
				
				if (y > 14) {
					System.out.println(" x = " + x);
				}
			}
		
	
}
}