package EncapsulationEx.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.trim().length() < 1) {
            throw new IllegalStateException("Name cannot be empty.");
        }
        this.name = name.trim();
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    public double productPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double eggsPerDay = 0;
        if (this.getAge() <= 5) {
            eggsPerDay = 2;
        } else if (this.getAge() > 11) {
            eggsPerDay = 0.75;
        } else {
            eggsPerDay = 1;
        }
        return eggsPerDay;
    }

    @Override
    public String toString() {
        return String.format("EncapsulationEx.AnimalFarm.Chicken %s (age %d) can produce %.2f eggs per day.", this.getName(), this.getAge(), this.productPerDay());
    }
}
