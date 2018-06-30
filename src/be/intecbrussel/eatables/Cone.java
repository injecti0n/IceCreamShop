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
		balls = new Flavors[0];
	}

	// Constructor with Flavors
	public Cone(Flavors[] balls) {
		this.balls = balls;
	}

	// The methods
	// You should always use getters and setters
	// https://stackoverflow.com/questions/1568091/why-use-getters-and-setters-accessors

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
		// Whatever
	}
}