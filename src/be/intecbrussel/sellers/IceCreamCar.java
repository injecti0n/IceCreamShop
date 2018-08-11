package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamCar implements IceCreamSeller {

	private PriceList priceList = new PriceList();
	private Stock stock = new Stock();
	private double totalProfit = 0;

	public IceCreamCar(PriceList priceList, Stock stock) {
		super();
		this.priceList = priceList;
		this.stock = stock;
	}

	public Cone orderCone(Flavor[] balls) {
		Cone ijsje = prepareCone(balls);			
		return ijsje;	
	}

	private Cone prepareCone(Flavor[] balls) {
		Cone ijsje = new Cone(balls);
		
		int stockCones = stock.getBalls();
		int stockBalls = stock.getBalls();
		
		
		stockCones -= 1;
		for (int i =0; i < balls.length; i++) {
			totalProfit += priceList.getBallPrice();
			stockBalls -= 1;			
		}
		
		stock.setBalls(stockBalls);
		stock.setCones(stockCones);
		
		return ijsje;
	}

	public IceRocket orderIceRocket() {
		IceRocket raketje = prepareIceRocket();
		return raketje;
	}
	
	private IceRocket prepareIceRocket() {
		int stockRacket = stock.getIceRockets();
		IceRocket raketje=null;
		if(stockRacket>0) {
		stockRacket--;
		totalProfit += priceList.getRocketPrice();
		raketje = new IceRocket();
		stock.setIceRockets(stockRacket);
		}
		
		return raketje;
	}
	
	public Magnum orderMagnum(MagnumType type) {
		Magnum magnumke = prepareMagnum(type);
		
		return magnumke;
	}
	
	public Magnum prepareMagnum(MagnumType type) {
		int stockMagnum = stock.getIceRockets();
		totalProfit += priceList.getMagnumPrice(type);
		Magnum magnumke = new Magnum(type);
		stock.setIceRockets(stockMagnum );		
		return magnumke;
	}

	@Override
	public double getProfit() {
		return totalProfit;
	}

	

}
