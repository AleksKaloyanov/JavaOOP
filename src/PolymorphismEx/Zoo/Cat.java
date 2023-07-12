package PolymorphismEx.Zoo;

public class Cat extends Feline {
    private String breed;

    protected Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten());
    }

}
