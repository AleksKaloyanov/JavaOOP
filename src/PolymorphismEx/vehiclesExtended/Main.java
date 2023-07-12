package PolymorphismEx.vehiclesExtended;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] inputCar = br.readLine().split("\\s+");
        String[] inputTruck = br.readLine().split("\\s+");
        String[] inputBus = br.readLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(inputCar[1]),
                Double.parseDouble(inputCar[2]), Double.parseDouble(inputCar[3]));
        Vehicle truck = new Truck(Double.parseDouble(inputTruck[1]),
                Double.parseDouble(inputTruck[2]), Double.parseDouble(inputTruck[3]));
        Vehicle bus = new Bus(Double.parseDouble(inputBus[1]),
                Double.parseDouble(inputBus[2]), Double.parseDouble(inputBus[3]));

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(bus);

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] tokens = input.split("\\s+");
            String cmd = tokens[0];
            String vehicle = tokens[1];
            double kmOrLiters = Double.parseDouble(tokens[2]);

            switch (cmd) {
                case "Drive":
                    if (vehicle.equals("Car")) {
                        System.out.println(car.drive(kmOrLiters));
                    } else if (vehicle.equals("Truck")) {
                        System.out.println(truck.drive(kmOrLiters));
                    } else {
                        System.out.println(bus.drive(kmOrLiters));
                    }
                    break;
                case "Refuel":
                    if (vehicle.equals("Car")) {
                        car.refuel(kmOrLiters);
                    } else if (vehicle.equals("Truck")) {
                        truck.refuel(kmOrLiters);
                    } else {
                        bus.refuel(kmOrLiters);
                    }
                    break;
                case "DriveEmpty":
                    System.out.println(((Bus) bus).driveEmpty(kmOrLiters));
                    break;
            }
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(String.format("%s: %.2f", vehicle.getClass().getSimpleName(),
                    vehicle.getFuelQuantity()));
        }
    }
}
