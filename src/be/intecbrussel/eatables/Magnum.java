package be.intecbrussel.eatables;

public class Magnum implements Eatable {

	MagnumType type;

	public Magnum() {
		super();
	}

	public Magnum(MagnumType type) {
		super();
		this.type = type;
	}

	public void eat() {
		System.out.println("eating a magnum with " + type);
	}

	public MagnumType getType() {
		return type;
	}

}
