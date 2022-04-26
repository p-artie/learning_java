package debug;

public class Test {

	public int getIntialValue() {
		int number = 5;
		
		number += 4;
		
		return number;
	}
	
	public void doStuff(int number) {
		number = number - 6;
		
		System.out.println(number);
	}

}
