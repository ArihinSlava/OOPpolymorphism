package transport;


public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, double engineCapacity,BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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

    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автомобиль марки " + getBrand() + ", тип кузова: " + bodyType.getBodyType());
        }
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
