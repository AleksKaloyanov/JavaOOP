package PolymorphismEx.vehiclesExtended;

import java.text.DecimalFormat;

public class Bus extends Vehicle {


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }


    @Override
    public String drive(double km) {
        if (km * (this.getFuelConsumption() + 1.4) <= this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - (km * (this.getFuelConsumption() + 1.4)));
            DecimalFormat format = new DecimalFormat("0.#");
            return this.getClass().getName() + " travelled " + format.format(km) + " km";
        }
        return this.getClass().getName() + " needs refueling";
    }

    public String driveEmpty(double km) {
        return super.drive(km);
    }

}
