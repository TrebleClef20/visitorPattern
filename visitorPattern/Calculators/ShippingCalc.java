package Calculators;

public interface ShippingCalc {
    public double computeFlatShip(String size, double distanceKM);
    public double computeDistanceShip(String size, double distanceKM);
    public double computeSizeShip(String size, double distanceKM);
}
