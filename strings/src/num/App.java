package num;

public class App {
	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 922789876;
		
		float floatValue = 8834.5f;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		
		System.out.println(doubleValue);
	}
}
