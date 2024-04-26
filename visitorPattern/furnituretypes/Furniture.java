package furnituretypes;

import Calculators.*;

public interface Furniture {
    public double accept(ShippingCalc shipCalc, String size, double distanceKM);
    public String getSize();
}
