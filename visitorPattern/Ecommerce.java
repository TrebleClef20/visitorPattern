import Calculators.*;
import furnituretypes.*;

public class Ecommerce {
    public static void main(String[] args) {

        // initialize furnitures
        Furniture whiteChair = new Chair("Sturdy White Chair", "medium");
        Furniture royalSofa = new Sofa("Luxurious Sofa", "large");
        Furniture commonerSofa = new Sofa("Plain Sofa", "medium");
        Furniture singleBed = new Bed("Bed for Single Forever", "small");
        Furniture queensBed = new Bed("Queen's Bed", "large");

        // initialize calculator
        ShippingCalc shippingCalc = new FurnitureShipCalc();

        double distanceKM;

        // Prints out calculations
        System.out.println("Printing Previous Shipping Calculations:");

        System.out.println("\n" + whiteChair);
        distanceKM = 20.0;
        System.out.println("and distance of " + distanceKM + " km for a total Shiping Cost = Php "
                + whiteChair.accept(shippingCalc, whiteChair.getSize(), distanceKM));

        System.out.println("\n" + royalSofa);
        distanceKM = 10.0;
        System.out.println("and distance of " + distanceKM + " km for a total Shiping Cost = Php "
                + royalSofa.accept(shippingCalc, royalSofa.getSize(), distanceKM));

        System.out.println("\n" + commonerSofa);
        distanceKM = 30.0;
        System.out.println("and distance of " + distanceKM + " km for a total Shiping Cost = Php "
                + commonerSofa.accept(shippingCalc, commonerSofa.getSize(), distanceKM));

        System.out.println("\n" + singleBed);
        distanceKM = 15.0;
        System.out.println("and distance of " + distanceKM + " km for a total Shiping Cost = Php "
                + singleBed.accept(shippingCalc, singleBed.getSize(), distanceKM));

        System.out.println("\n" + queensBed);
        distanceKM = 30.0;
        System.out.println("and distance of " + distanceKM + " km for a total Shiping Cost = Php "
                + queensBed.accept(shippingCalc, queensBed.getSize(), distanceKM));
    }
}