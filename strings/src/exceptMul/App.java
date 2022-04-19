package exceptMul;

import java.io.IOException;
import java.text.ParseException;

public class App {
	public static void main(String[] args) {
		Test test = new Test();
		
		//Catch block for each exception that could be thrown
		/*
		try {
	d ecelip		test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Catch block but with multiple exception in one catch block
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Using polymorphism by changing the exception to the parent exception class
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
