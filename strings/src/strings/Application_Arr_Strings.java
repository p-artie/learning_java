package strings;

public class Application_Arr_Strings {

	public static void main(String[] args) {
		String[] words = new String[3];

		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		String[] fruits = { "apple", "banana", "pear", "kiwi" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		int value = 0;

		String text = null;

		// System.out.println(text);

		String[] texts = new String[2];

		texts[0] = "one";

		System.out.println(texts[0]);

		//fruits={"new apple","new banana","new pear"," new kiwi"};
		
		fruits[0] = "new apple";

		System.out.println(fruits[0]);
	}
}