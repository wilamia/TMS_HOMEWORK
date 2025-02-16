package vehicle_system.garage;

import vehicle_system.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicleList;

    public Garage() {
        vehicleList = new ArrayList<>();
    }

    public void startAll() {
        if (!vehicleList.isEmpty()) {
            for (Vehicle vehicle : vehicleList) {
                vehicle.start();
            }
        } else {
            System.out.println("Гараж пустой!");
        }
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void displayInfo() {
        System.out.println();
        int count = 0;
        for (Vehicle vehicle : vehicleList) {
            System.out.print(count + 1 + " ");
            vehicle.displayInfo();
            count++;
            System.out.println();
        }
    }

    public void stopConcrete(int id) {
        if (id >= 0 && id <= vehicleList.size()) {
            vehicleList.get(id).stop();
        } else {
            System.out.println("Такого транспорта нет");
        }
    }

    public void startConcrete(int id) {
        if (id >= 0 && id <= vehicleList.size()) {
            vehicleList.get(id).start();
        } else {
            System.out.println("Такого транспорта нет");
        }
    }

    public void stopAll() {
        if (!vehicleList.isEmpty()) {
            for (Vehicle vehicle : vehicleList) {
                vehicle.stop();
            }
        } else {
            System.out.println("Гараж пустой!");
        }
    }
}
