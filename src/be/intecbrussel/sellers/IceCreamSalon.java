package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamSalon implements IceCreamSeller, Profitable{

	private PriceList priceList;
	private double totalProfit=0;
	
	

	
	public IceCreamSalon(){
		this(new PriceList());
	}
	public IceCreamSalon(PriceList priceList){
		this.priceList=priceList;
	}
	
	@Override
	public double getProfit() {
		 
		return totalProfit;
	}

	@Override
	public Cone orderCone(Flavor[] flavor) {
		Cone hoorntje = new Cone(flavor);
		totalProfit += priceList.getBallPrice() * flavor.length;
		
		return hoorntje;
	}

	@Override
	public IceRocket orderIceRocket() {
		IceRocket raketijsje = new IceRocket();
		totalProfit +=priceList.getRocketPrice();
		
		return raketijsje;
	}

	@Override
	public Magnum orderMagnum(MagnumType magnumSavour) {
		Magnum gigantiko = new Magnum(magnumSavour);
		totalProfit +=priceList.getMagnumPrice(magnumSavour);
		
		return gigantiko;
	}
	

}
