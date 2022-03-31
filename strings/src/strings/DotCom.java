package strings;
import java.util.ArrayList;


public class DotCom {
	//int[] locationCells;
	//int numOfHits = 0;
	
	private ArrayList<String> locationCells;
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public String checkYourself(String userInput) {
		//int guess = Integer.parseInt(stringGuess);
		
		
	/*	for (int cell : locationCells) {
			if (guess == cell) {
				
				result = "hit";
				numOfHits++;
				
				break;
			}
		} */
		
		
		
		/*if (numOfHits == locationCells.length) {
			result = "kill";
		} */
		
		String result = "miss"; 
		
		int index = locationCells.lastIndexOf(userInput);
		
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit"; 
					
			}
		}
		
		//System.out.println(result);
		return result;
	}
}
