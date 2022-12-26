package Transport;

import java.util.Objects;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
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



    @Override
    public void getMaxSpeed() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " проехал с максимальной скорость: ");
    }
}


