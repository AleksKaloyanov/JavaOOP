package PolymorphismEx.vehiclesExtended;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        } else if (this.fuelQuantity + liters > this.getTankCapacity()) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }

        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }

    public String drive(double km) {
        if (km * this.getFuelConsumption() <= this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - (km * this.getFuelConsumption()));
            DecimalFormat format = new DecimalFormat("0.#");
            return this.getClass().getName() + " travelled " + format.format(km) + " km";
        }
        return this.getClass().getName() + " needs refueling";
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }
}
