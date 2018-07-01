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
	
	
	 // Constructor
    public IceCreamCar() {

    }
    
    public IceCreamCar(PriceList priceList, Stock stock) {
        this.pricelist = priceList;
        this.stock = stock;
    }
	
    // Methods
    // Order Cone
    @Override
    public Cone orderCone(Flavors[] balls) {
        this.prepareCone(balls);
        return new Cone(balls);
    }

    
//  // Prepare Cone
  private Cone prepareCone(Flavors[] balls) {
      int countCones = 1;

      if (stock.getCones() < 0 || stock.getBalls() < 0) {
          throw new Exception("No more Balls or Cones");
      } else {
          for (int i = 0; i < balls.length; i++) {
              stock.setBalls(stock.getBalls() - balls.length);
              profit += pricelist.getBallPrice();
          }
          System.out.println("Preparing your Balls on a cone");
          countCones++;
          stock.setCones(stock.getCones() - countCones);
      }
      return new Cone(balls);
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
	
	public IceRocket prepareRocket(IceRocket icerocket) {
		return null;
		
	}
	
		
		
	
	

	}
