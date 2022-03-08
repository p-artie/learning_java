package strings;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output prompt
		System.out.println("Enter an integer: ");
		
		//Wait for the user to enter something.
		int value = input.nextInt();
		
		// Tell them what they entered
		System.out.println("You entered: " + value);
				
	}
}
