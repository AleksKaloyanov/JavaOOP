package EncapsulationEx.PizzaCalories;

public enum FlourTypes {
    WHITE(1.5),
    WHOLEGRAIN(1.0);

    private double modifier;

    FlourTypes(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
