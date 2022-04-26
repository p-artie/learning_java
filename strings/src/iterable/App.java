package iterable;

public class App {

	public static void main(String[] args) {
		
		UrlLibrary urlLib = new UrlLibrary();
		
		for(String url: urlLib) {
			System.out.println(url);
		}

	}

}
