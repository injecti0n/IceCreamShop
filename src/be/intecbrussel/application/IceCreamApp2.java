package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2 {
    public static void main(String[] args) {
    	
    	PriceList prijzen = new PriceList(2,1.5,3);	
		PriceList prijzenAuto = new PriceList(2,1.5,3);	
		Stock stock = new Stock();
		
		IceCreamSeller testje = new IceCreamSalon(prijzen);		
		Flavor[] test = {Flavor.BANANA,Flavor.LEMON};
				
		Eatable[] bestelling3 = {testje.orderIceRocket(),testje.orderCone(test)};
		
		
		IceCreamSeller testAuto  = new IceCreamCar(prijzen,stock);		

		Eatable[] bestelling4 = {testAuto.orderIceRocket(),testAuto.orderCone(test), testAuto.orderMagnum(MagnumType.ALPINENUTS)};
		
		
		double winst = testje.getProfit();
		System.out.println(winst);
		
		double winstAuto = testAuto.getProfit();
		System.out.println(winstAuto);
		}
    	
  /*  	PriceList priceList2 = new PriceList(2, 5, 8);

        Stock stock = new Stock(1, 8, 2, 1);

        
        IceCreamCar<Stock> ice = new IceCreamCar(priceList2, stock);

        Eatable[] eatCar = {
                iceCar.orderCone(new Flavors[]{Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.VANILLA}),
                iceCar.orderCone(new Flavors[]{Cone.Flavor.VANILLA, Cone.Flavor.VANILLA}),
                iceCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCar.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                iceCar.orderIceRocket()
        };

        for (int i = 0; i < eatCar.length; i++) {
            try {
                eatCar[i].eat();
            } catch (NoMoreIceCreamException noMoreIce) {
                System.out.println("No More Ice To sell... Beat it!!");
               
            }

        }
        System.out.println(iceCar.getProfit());*/
    }
