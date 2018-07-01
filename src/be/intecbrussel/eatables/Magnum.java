package be.intecbrussel.eatables;

public class Magnum implements Eatable {

	// The types of flavors
	public enum MagnumType {
		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE
	}

	private MagnumType MagnumType;

	public void eat() {

		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Magnum [MagnumType=" + MagnumType + "]";
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
