package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamSalon implements IceCreamSeller {
	
	private PriceList priceList = new PriceList();
	private double totalProfit = 0;
	
	public IceCreamSalon(PriceList priceList) {
		super();
		this.priceList = priceList;
	}	
	
	public Cone orderCone(Flavor[] balls) {		
		Cone ijsje = new Cone(balls);		
		for (int i =0; i < balls.length; i++) {
			totalProfit += priceList.getBallPrice();			
		}
		
		return ijsje;		
	
	}
	
	public IceRocket orderIceRocket() {
		IceRocket raket = new IceRocket();
		totalProfit += priceList.getRocketPrice();
		return raket;
	}
	
	public Magnum orderMagnum(MagnumType type) {
		
		totalProfit += priceList.getMagnumPrice(type);
		return null;
	}	

	@Override
	public String toString() {
		return "IceCreamSalon [priceList=" + priceList + ", totalProfit=" + totalProfit + "]";
	}

	@Override
	public double getProfit() {
		return totalProfit;
	}
	
	

}
