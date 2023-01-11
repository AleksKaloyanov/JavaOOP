package EncapsulationEx.ShoppingSpree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new LinkedList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalStateException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalStateException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void buyProduct(Product product) {
        if (this.money - product.getCost() >= 0) {
            this.money -= product.getCost();
            this.products.add(product);
        } else {
            throw new IllegalStateException(String.format("%s can't afford %s", this.getName(), product.getName()));
        }
    }
}
