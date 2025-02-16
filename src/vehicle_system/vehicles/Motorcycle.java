package vehicle_system.vehicles;

public class Motorcycle implements Vehicle {
    private double engineCapacity;
    private boolean isInAction = false;

    public Motorcycle(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        if (!isInAction) {
            System.out.println("Мотоцикл начал движение!");
            isInAction = true;
        } else {
            System.out.println("Мотоцикл уже движется!");
        }
    }

    @Override
    public void stop() {
        if (isInAction) {
            System.out.println("Мотоцикл закончил движение!");
            isInAction = false;
        } else {
            System.out.println("Мотоцикл уже закончил движение!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип транспорта: мотоцикл. Объем двигателя мотоцикла: " + engineCapacity);
    }
}
