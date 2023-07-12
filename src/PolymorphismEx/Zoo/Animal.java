package PolymorphismEx.Zoo;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.setFoodEaten(foodEaten);
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);


    public String getAnimalName() {
        return animalName;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }
}
