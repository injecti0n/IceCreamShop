package be.intecbrussel.eatables;

public class Cone implements Eatable {

	// The types of flavors
	public enum Flavors {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE
	}
	
	

	// The field
	private Flavors[] balls;

	// The constructors
	// Constructor Basic
	public Cone() {
		balls = new Flavors[8];
	}

	// Constructor with Flavors
	public Cone(Flavors[] balls) {
		this.balls = balls;
	}


	// Getter
	public Flavors[] getBalls() {
		return balls;
	}

	// Setter
	public void setBalls(Flavors[] balls) {
		this.balls = balls;
	}

	// Your Method from UML
	public void eat() {
		System.out.println("Cone Balls");
	}
}