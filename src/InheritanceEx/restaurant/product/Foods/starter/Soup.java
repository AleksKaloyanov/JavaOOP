package InheritanceEx.restaurant.product.Foods.starter;

import InheritanceEx.restaurant.product.Foods.Starter;

import java.math.BigDecimal;

public class Soup extends Starter {
    public Soup(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
