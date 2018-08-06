package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {

	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;

	public PriceList() {
		super();
	}

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

	public double getMagnumPrice(MagnumType type) {
		switch (type) {
		case ALPINENUTS:
			magnumStandardPrice *= 1.3;
		case BLACKCHOCOLATE:
			magnumStandardPrice *= 1;
		case MILKCHOCOLATE:
			magnumStandardPrice *= 1;
		case WHITECHOCOLATE:
			magnumStandardPrice *= 1;
		case ROMANTICSSTRAWBERRIES:
			magnumStandardPrice *= 1.6;
		}
		return magnumStandardPrice;

	}

	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}

}
