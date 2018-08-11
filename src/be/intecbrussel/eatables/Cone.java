package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

	private Flavor[] balls= new Flavor [0];

	public Cone() {	
	}

	public Cone(Flavor[] balls) {
		this.balls = balls;
	}
	
	
	
	@Override
	public void eat() {
		System.out.println("Eating a Cone with flavors: " );
	
	for (Flavor ball : balls) 
	System.out.println(ball);   
	}

	@Override
	public String toString() {
		return "Cone [balls=" + Arrays.toString(balls) + "]";
	}

	
	
}

