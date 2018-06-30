package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public abstract class IceCreamSalon implements IceCreamSeller, Profitable {
	
	
	private PriceList priceList;
	private double totalProfil;
	
	public double getProfit() {
		return totalProfil;
		
	}
	
	public <Flavor> Cone orderCone(Flavor[] flavor) {
		return null;
		
	}
	
	public IceRocket orderIceRocket() {
		return null;
		
	}
	
	public Magnum orderMagnum(MagnumType magnumtype) {
		return null;
		
	}

	@Override
	public String toString() {
		return "IceCreamSalon [priceList=" + priceList + ", totalProfil=" + totalProfil + "]";
	}
	
	

}
