package be.intecbrussel.eatables;

public class Magnum implements Eatable {

	MagnumType MagnumType;

	public void eat() {

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
