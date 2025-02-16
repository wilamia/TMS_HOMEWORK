package vehicle_system.vehicles;

public class Bike implements Vehicle {
    private String type;
    private boolean isInAction = false;

    public Bike(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        if (!isInAction) {
            System.out.println(type + " велосипед начал движение!");
            isInAction = true;
        } else {
            System.out.println(type + " велосипед уже движется!");
        }
    }

    @Override
    public void stop() {
        if (isInAction) {
            System.out.println(type + " велосипед закончил движение!");
            isInAction = false;
        } else {
            System.out.println(type + " велосипед уже закончил движение!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип транспорта: велосипед. Тип велосипеда: " + type);
    }
}
