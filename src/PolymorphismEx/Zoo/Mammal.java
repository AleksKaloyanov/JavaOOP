package PolymorphismEx.Zoo;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            this.eat(food);
        } else {
            this.setFoodEaten(0);
            System.out.printf("%ss are not eating that type of food!%n", this.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        String output = String.format("%s [%s, ", this.getClass().getSimpleName(), this.getAnimalName());
        output += format.format(getAnimalWeight());
        output += String.format(", %s, %d]", this.livingRegion, this.getFoodEaten());
        return output;
    }

}
