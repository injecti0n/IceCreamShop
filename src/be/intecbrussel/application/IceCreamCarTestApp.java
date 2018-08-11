package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamCarTestApp {

	public static void main(String[] args) {
		
			 
			 iceCreamSalonPricelistConstructorTest();
		}

		private static void iceCreamSalonPricelistConstructorTest() {
			System.out.println("testing icreCreamCar with pricelist in constructor\n");
			PriceList priceList = new PriceList(1,1,1.5);
			Stock stock = new Stock(10, 10, 10, 10);
			IceCreamSeller seller = new IceCreamCar(priceList,stock);
//			testOrderCone(seller);
//			testOrderIceRocket(seller);
//			testOrderMagnum(seller);
//			testProfit(seller);
			testOrderAThousandIceRockets(seller);
		}

		private static void testOrderAThousandIceRockets(IceCreamSeller seller) {
			Eatable[] rockets = new Eatable[1000];
			for(int i = 0; i<1000;i++) {
				rockets[i] = seller.orderIceRocket();
			}
			System.out.println(rockets[0]);
			System.out.println(rockets[999]);
			
		}

		private static void testProfit(IceCreamSeller seller) {
			System.out.println("testing profit");
			System.out.println("profit is: " + seller.getProfit());
			System.out.println("profit is larger than 0: " + (seller.getProfit()>0));
			
		}

		private static void testOrderMagnum(IceCreamSeller seller) {
			System.out.println("testing ther ordering of a magnum");
			Eatable magnum = seller.orderMagnum(MagnumType.WHITECHOCOLATE);
			System.out.println(magnum);
			
		}

		private static void testOrderIceRocket(IceCreamSeller seller) {
			System.out.println("testing ther ordering of an IceRocket");
			Eatable rocket = seller.orderIceRocket();
			System.out.println(rocket);
			
		}

		private static void testOrderCone(IceCreamSeller seller) {
			System.out.println("testing ther ordering of a cone");
			Eatable cone = seller.orderCone(new Flavor[]{Flavor.MOKKA});
			System.out.println(cone);
			
		}

		

}
