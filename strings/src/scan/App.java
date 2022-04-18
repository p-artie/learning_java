package scan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		//Using a path from outside the project
		//String fileName = "/Users/Arturo.Polanco/eclipse-workspace/example.txt";
		
		
		//Using a path from within the Project directory
		String fileName = "example.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		
		System.out.println("Read value: " + value);
		in.nextLine();
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(count + ": " + line);
			count++;
		}
		
		in.close();
	}
}
