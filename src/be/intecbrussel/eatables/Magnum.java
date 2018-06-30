package be.intecbrussel.eatables;

public class Magnum implements Eatable {

	// The types of flavors
	public enum MagnumType {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE
	}

	MagnumType MagnumType;

	public void eat() {

		System.out.println(toString());

	}

	public Magnum(MagnumType MagnumType) {
		super();
		this.MagnumType = MagnumType;
	}

	public MagnumType getMagnumType() {
		return MagnumType;
	}

	public void setMagnumType(MagnumType magnumType) {
		MagnumType = magnumType;
	}

	public Magnum() {
		super();
	}

}
