package extendingExample;

public class TestMachine {
	public static void main(String[] args) {
		Machine mach1 = new Machine();
		mach1.start();
		
		mach1.showInfo();
		
		Person person1 = new Person("Artie");
		person1.greet();
		person1.showInfo(); 
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(mach1);
		outputInfo(person1);
	}
	
	private static void outputInfo(Info info) {
		info.showInfo();  
	}
}

 