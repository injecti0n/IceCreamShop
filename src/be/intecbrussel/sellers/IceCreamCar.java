package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavors;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public abstract class IceCreamCar<Stock> implements IceCreamSeller, Profitable {

	private PriceList pricelist;
	private Stock stock;
	private double profit;
	
	public Cone orderCone(Flavors[] flavor) {
		return null;
			
		}

	public IceRocket orderIceRocket() {
				return null;
			}

	public Magnum orderMagnum(MagnumType magnumtype) {
		return null;
				
			}
	
	public Magnum prepareMagnum(MagnumType magnumtype) {
		return null;
		
	}
	
	public IceRocket prepareRocket(IceRocket icerocket) {
		return null;
		
	}
	
	public <Flavor> Cone prepareCone(Flavor[] flavor) {
		return null;
		
	}
	

	}
