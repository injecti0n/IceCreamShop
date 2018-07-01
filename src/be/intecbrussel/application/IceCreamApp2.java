package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavors;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2 {
    public static void main(String[] args) {
    	
    	PriceList priceList1 = new PriceList(2,5,8);
    	
    	Stock stock = new Stock(1,8,2,1);
    	
    	IceCreamCar IceShop = new IceCreamCar(priceList1, stock);
    	
    	
    	Eatable[] eatCar = {
    			IceShop.orderCone(new Flavors[]{Cone.Flavors.CHOCOLATE, Cone.Flavors.BANANA, Cone.Flavors.VANILLA}),
    			IceShop.orderCone(new Flavors[]{Cone.Flavors.VANILLA, Cone.Flavors.VANILLA}),
    			IceShop.orderMagnum(MagnumType.CHOCOLATE),
    			IceShop.orderMagnum(MagnumType.BANANA),
    			
    			IceShop.orderIceRocket()
        };
    	
    	 for (int i = 0; i < eatCar.length; i++) {
             eatCar[i].eat();

         }
         System.out.println(IceShop.getProfit());
    	
  
    }
}