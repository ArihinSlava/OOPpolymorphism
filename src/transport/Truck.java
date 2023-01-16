package transport;

import mechanic.AbilityToWorkCars;
import mechanic.Mechanic;

import java.util.List;
import java.util.Map;

public class Truck extends Transport implements Competing {

    private LoadCapacity loadCapacity;


    public Truck(String brand, String model, double engineCapacity , LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand, String model, double engineCapacity,  List<Mechanic> mechanic, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity, mechanic);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand, String model, double engineCapacity, List<Mechanic> mechanic, List<Transport> transports, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity, mechanic, transports);
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

    @Override
    public void passDiagnostics() {
        System.out.println("Нужно пройти диагностику!");
    }

    @Override
    public void performMaintenance(List<Mechanic> mechanics) {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineCapacity());
        for (Mechanic value : mechanics) {
            if (value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_TRUCK || value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }

        }

    }

    @Override
    public void fixTheCar(List<Mechanic> mechanics) {

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
