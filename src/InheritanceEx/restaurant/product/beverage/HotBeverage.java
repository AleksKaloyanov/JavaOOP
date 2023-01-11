package InheritanceEx.restaurant.product.beverage;

import InheritanceEx.restaurant.product.Beverage;

import java.math.BigDecimal;

public abstract class HotBeverage extends Beverage {
    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }


}
