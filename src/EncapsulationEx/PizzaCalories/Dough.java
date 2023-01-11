package EncapsulationEx.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        for (FlourTypes value : FlourTypes.values()) {
            if (value.name().equals(flourType.toUpperCase())) {
                this.flourType = flourType;
                return;
            }
        }
        throw new IllegalStateException("Invalid type of dough.");
    }

    public void setBakingTechnique(String bakingTechnique) {
        for (BakingTechniques value : BakingTechniques.values()) {
            if (value.name().equals(bakingTechnique.toUpperCase())) {
                this.bakingTechnique = bakingTechnique;
                return;
            }
        }
        throw new IllegalStateException("Invalid type of dough.");
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalStateException("EncapsulationEx.PizzaCalories.Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double total = 1;
        total *= (2 * this.weight);
        total *= FlourTypes.valueOf(this.flourType.toUpperCase()).getModifier();
        total *= BakingTechniques.valueOf(this.bakingTechnique.toUpperCase()).getModifier();

        return total;
    }
}
