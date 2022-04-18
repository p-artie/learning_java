package converter;

public class Convert {
	private final float LITER_RATIO = 3.78541f;
	
	public void galToLiters(float gallons) {
		System.out.println(gallons * this.LITER_RATIO);
	}
	
	public void litersToGal(float liters) {
		System.out.println(liters / this.LITER_RATIO);
	}
}
