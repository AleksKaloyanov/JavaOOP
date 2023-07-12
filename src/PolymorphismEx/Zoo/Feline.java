package PolymorphismEx.Zoo;

public abstract class Feline extends Mammal {
    protected Feline(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }


    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            this.eat(food);
        } else {
            this.setFoodEaten(0);
            System.out.printf("%ss are not eating that type of food!%n", this.getClass().getSimpleName());
        }
    }
}
