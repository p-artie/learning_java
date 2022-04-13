package ppp;

import world.Plant;

public class TestPlant {
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		//Wont' work -- type is private
		//System.out.println(plant.type);
		
		//size is protected and this class is not in the same package.
		//System.out.println(plant.size);
	}
}
