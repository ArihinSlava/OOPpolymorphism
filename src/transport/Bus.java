package transport;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineCapacity, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение!");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус заканчивает движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " сделал пит-стоп");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " показал лучшее время круга: ");
    }

    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("У автобуса " + getBrand() + " вместимость людей от : " + capacity.capacityLowerLimit() + " до " + capacity.capacityUpperLimit());
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " проехал с максимальной скорость: ");
    }
}


