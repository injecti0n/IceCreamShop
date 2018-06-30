package be.intecbrussel.sellers;
import be.intecbrussel.eatables.*;
public class PriceList {

	double ballPrice;
	double rocketPrice;
	double magnumStandardPrice;
	
	be.intecbrussel.eatables.Magnum.MagnumType MagnumType;

	
	
	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
		super();
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public double getBallPrice() {
		return ballPrice;
	}

	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}

	public double getRocketPrice() {
		return rocketPrice;
	}

	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}

	public double getMagnumStandardPrice() {
		return magnumStandardPrice;
	}

	public double getMagnumPrice() {
		return (magnumStandardPrice/2)+magnumStandardPrice+magnumStandardPrice;
		
	}
	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public PriceList() {
		super();
	}

}
