package InheritanceEx.restaurant.product.beverage;

import InheritanceEx.restaurant.product.Beverage;

import java.math.BigDecimal;

public abstract class ColdBeverage extends Beverage {
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
