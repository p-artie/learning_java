package sortList;

import java.util.Comparator;

public class ReverseAlphabeticalComparator implements Comparator{

	public int compare(Object s1, Object s2) {

		return -((String) s1).compareTo((String) s2);
	}
	
}
 