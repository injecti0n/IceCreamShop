package be.intecbrussel.eatables;

public class  Magnum implements Eatable {
	private MagnumType type;
	
	
	public  Magnum() {
		this(MagnumType.MILKCHOCOLATE);
	}
	
	public Magnum (MagnumType type) {
		this.type = type;
	}

	public MagnumType getType() {
		return type;
	}
	


	
	@Override
	public void eat() {
		System.out.println("Eating a Magnum of type " + getType());
	}

	@Override
	public String toString() {
		return "Magnum [type=" + type + "]";
	}
	

}
