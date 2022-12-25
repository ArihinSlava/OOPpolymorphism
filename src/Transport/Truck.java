package Transport;

import Transport.Transport;

public class Truck extends Transport implements Competing {


    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
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

    @Override
    public void getMaxSpeed() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " поехал с максимальной скорость: " );;
    }
}
