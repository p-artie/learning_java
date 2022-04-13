package ppp;

import world.Plant;

public class Grass extends Plant {
	public Grass() {
		
		//Wont work --- Grass is not the same package as Plant, even though it extends it. 
		//System.out.println(this.height);
	}
}
