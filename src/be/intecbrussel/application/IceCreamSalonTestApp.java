package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamSalonTestApp {

	public static void main(String[] args) {
		 iceCreamSalonDefaultConstructorTest();
		 iceCreamSalonPricelistConstructorTest();
	}

	private static void iceCreamSalonPricelistConstructorTest() {
		System.out.println("testing icreCreamSalon with pricelist in constructor\n");
		PriceList priceList = new PriceList(1,1,1.5);
		IceCreamSeller seller = new IceCreamSalon(priceList);
		testOrderCone(seller);
		testOrderIceRocket(seller);
		testOrderMagnum(seller);
		testProfit(seller);
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

	private static void iceCreamSalonDefaultConstructorTest() {
		System.out.println("testing icreCreamSalon with the default constructor\n");
		IceCreamSeller seller = new IceCreamSalon();
		testOrderCone(seller);
		testOrderIceRocket(seller);
		testOrderMagnum(seller);
		testProfit(seller);
		
	}

}
