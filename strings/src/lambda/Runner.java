package lambda;

public class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block...");
		int value = e.execute();
		System.out.println("Return value is: " + value);
	}
}
