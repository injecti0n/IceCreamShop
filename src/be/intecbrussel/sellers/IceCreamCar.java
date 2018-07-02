package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavors;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.Stock;

public class IceCreamCar implements IceCreamSeller, Profitable {

	private PriceList pricelist;
	private Stock stock;
	private double profit;

	// Constructor
	public IceCreamCar() {
		super();
	}

	public IceCreamCar(PriceList priceList, Stock stock) {
		this.pricelist = priceList;
		this.stock = stock;
	}

	// Methods
	// Order Cone
	@Override
	public Cone orderCone(Flavors[] balls) {
		try {
			this.prepareCone(balls);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Cone(balls);
	}

	
	
	

	private void prepareCone(Flavors[] balls) {
		int countCones=0;

		if (stock.getCones() > 0 || stock.getballs() > 0) {
			

		} else {
			for (int i = 0; i < balls.length; i++) {
				stock.setBalls(stock.getballs() - balls.length);
				profit += pricelist.getBallPrice();
			}
			System.out.println("Preparing your Balls on a cone");
			countCones++;
			stock.setCones(stock.getCones() - countCones);
		}
		
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

	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		return 0;
	}

}
