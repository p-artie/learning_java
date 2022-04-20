package read2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	public static void main(String[] args) {
		File file = new File("Test.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			
			while( (line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the file fool..." + file.toString());;
		} catch (IOException e) {
			System.out.println("Cannot read the file fool..." + file.toString());;
		}
	
	}
}
