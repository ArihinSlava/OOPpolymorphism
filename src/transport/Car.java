package transport;


public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начинает движение!");
    }

    @Override
    public void endMoving() {
        System.out.println("Автомобиль заканчивает движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " делает пит-стоп");;
    }



    @Override
    public void getBestLapTime() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ": лучшее время круга составило: ");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ": максимальная скорость составила : ");;
    }
}
