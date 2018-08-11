package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class EatablesTestApp {

	public static void main(String[] args) {
		//testIceRocket();
		testMagnum();
		//testCone();

	}
	
	private static void testCone() {
		testConeMultipleFlavors();
		
		testConeSingleFlavor();
		
		testConeNoFlavor();
	}

	private static void testConeNoFlavor() {
		System.out.println("testing no flavored cone");
		Eatable cone = new Cone();
		cone.eat();
		
	}

	private static void testConeSingleFlavor() {
		System.out.println("testing single flavored cone");
		Flavor [] flavors = new Flavor[]{Flavor.STRACIATELLA};
		Eatable cone = new Cone(flavors);
		cone.eat();
		
	}

	private static void testConeMultipleFlavors() {
		System.out.println("testing multiple flavored cone");
		Flavor [] flavors = {Flavor.BANANA,Flavor.STRAWBERRY};
		Eatable cone = new Cone(flavors);
		cone.eat();
		
	}

	private static void testMagnum() {
		testMagnumWithType();
		testMagnumWithoutType();
		
	}

	private static void testMagnumWithoutType() {
		System.out.println("testing magnum with no flavor selected:\n");
		Eatable magnum = new Magnum();
		magnum.eat();
		
	}

	private static void testMagnumWithType() {
		System.out.println("testing magnum with alpinenuts selected:\n");
		Eatable magnum = new Magnum(MagnumType.ALPINENUTS);
		magnum.eat();
		
	}

	private static void testIceRocket() {
		Eatable food = new IceRocket();
		food.eat();
	}

}
