package enume;

public class Animal {
	
	public static void main(String[] args) {
		
		Animals animal = Animals.CAT;
		
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;
		}
		
		
		System.out.println(Animals.DOG.getClass());
		
		System.out.println("Enum name as a string: " + Animals.DOG.name());
		
		//Testing out that Animals is a child of Enum
		System.out.println(Animals.DOG instanceof Enum);
		
		System.out.println(Animals.MOUSE.getName());
		
		System.out.println(Animals.DOG.toString());
		
		Animals animal2 = Animals.valueOf("CAT");
		
		System.out.println(animal2);
	}
}
