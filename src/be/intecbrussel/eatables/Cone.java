package be.intecbrussel.eatables;

public class Cone implements Eatable {

	private Flavor[] Balls;

	public Cone() {
		super();
	}

	public Cone(Flavor[] balls) {
		super();
		Balls = balls;
	}

	public void eat() {
		System.out.println("eating a cone with" + Balls);
	}
}