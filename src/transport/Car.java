package transport;


import mechanic.AbilityToWorkCars;
import mechanic.Mechanic;

import java.util.List;

public class Car extends Transport implements Competing {

    private  BodyType bodyType;

    public Car(String brand, String model, double engineCapacity,BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;

    }

    public Car(String brand, String model, double engineCapacity, List<Mechanic> mechanic, BodyType bodyType) {
        super(brand, model, engineCapacity, mechanic);
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineCapacity, List<Mechanic> mechanic, List<Transport> transports, BodyType bodyType) {
        super(brand, model, engineCapacity, mechanic, transports);
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
    public void performMaintenance(List<Mechanic> mechanics) {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineCapacity());
        for (Mechanic value : mechanics) {
            if (value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_CARS || value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }
        }

    }

    @Override
    public void fixTheCar(List<Mechanic> mechanics) {

    }

    @Override
    public void passDiagnostics() {
        System.out.println("Нужно пройти диагностику!");
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
