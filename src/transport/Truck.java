package transport;

public class Truck extends Transport implements Competing {

    private LoadCapacity loadCapacity;


    public Truck(String brand, String model, double engineCapacity , LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Тягач начинает движение!");
    }

    @Override
    public void endMoving() {
        System.out.println("Тягач заканчивает движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " делает пит-стоп");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " лучшее время круга составило ");
    }

    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("У грузовика марки " + getBrand() + " грузоподъемность составляет от " +
                    loadCapacity.getLoadCapacityLowerLimit() + " до " + loadCapacity.getLoadCapacityUpperLimit());
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " поехал с максимальной скорость: " );;
    }
}
