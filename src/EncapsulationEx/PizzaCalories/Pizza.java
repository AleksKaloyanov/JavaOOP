package EncapsulationEx.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    public void setName(String name) {
        if (name.trim().length() < 1 || name.length() > 15) {
            throw new IllegalStateException("EncapsulationEx.PizzaCalories.Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalStateException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        if (this.toppings.size() == 10) {
            throw new IllegalStateException("Number of toppings should be in range [0..10].");
        }
        this.toppings.add(topping);
    }

    public double getOverAllCalories() {
        double total = this.dough.calculateCalories();

        if (!this.toppings.isEmpty()) {
            for (Topping topping : toppings) {
                total += topping.calculateCalories();
            }
        }

        return total;
    }

    public String getName() {
        return name;
    }
}
