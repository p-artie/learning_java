package lambda;

public class App {
	public static void main(String[] args) {

		Runner runner = new Runner();

		runner.run(new Executable() {
			public int execute() {
				System.out.println("Hello there");
				return 7;
			}
		});

		System.out.println("------------New in Java 8-----------");

		runner.run(() -> 8);
	}
}
