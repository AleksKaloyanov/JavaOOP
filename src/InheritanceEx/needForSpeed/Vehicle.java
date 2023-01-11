package InheritanceEx.needForSpeed;

public abstract class Vehicle {
    private final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        setFuel(fuel);
        setHorsePower(horsePower);
        setFuelConsumption(this.DEFAULT_FUEL_CONSUMPTION);
    }

    public void drive(double kilometers) {
        if (getFuel() >= kilometers * this.fuelConsumption) {
            setFuel(getFuel() - (kilometers * this.fuelConsumption));
        }else {
            throw new IllegalStateException("Not enough fuel for a drive");
        }
    }

    public double getDEFAULT_FUEL_CONSUMPTION() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    protected void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    protected void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
