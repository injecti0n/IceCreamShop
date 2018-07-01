package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavors;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.*;

public class IceCreamApp2 {
    public static <PriceList> void main(String[] args) {
    	PriceList priceList2 = new PriceList(2, 5, 8);

        Stock stock = new Stock(1, 8, 2, 1);

        IceCreamCar iceCar = new IceCreamCar(priceList2, stock);

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
        System.out.println(iceCar.getProfit());
    }
}