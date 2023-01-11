package EncapsulationEx.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        for (ToppingTypes value : ToppingTypes.values()) {
            if (toppingType.toUpperCase().equals(value.name())) {
                this.toppingType = toppingType;
                return;
            }
        }
        throw new IllegalStateException(String.format("Cannot place %s on top of your pizza.", toppingType));
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalStateException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return ToppingTypes.valueOf(this.toppingType.toUpperCase()).getModifier() * (this.weight * 2);
    }
}
