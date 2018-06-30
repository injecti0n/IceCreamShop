package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavors;

public interface IceCreamSeller extends Profitable {

	public Cone orderCone(Flavor[8]);
	
}