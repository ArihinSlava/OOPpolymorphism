package transport;

import mechanic.AbilityToWorkCars;
import mechanic.Mechanic;

import java.util.List;
import java.util.Map;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineCapacity, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineCapacity, List<Mechanic> mechanic, Capacity capacity) {
        super(brand, model, engineCapacity, mechanic);
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineCapacity, List<Mechanic> mechanic, List<Transport> transports, Capacity capacity) {
        super(brand, model, engineCapacity, mechanic, transports);
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

    public void passDiagnostics() {
        System.out.println("Автобус не проходит диагностику! ");
    }

    @Override
    public void performMaintenance(List<Mechanic> mechanics) {
        System.out.println("Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineCapacity());
        for (Mechanic value : mechanics) {
            if (value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_BUS || value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }

        }

    }

    @Override
    public void fixTheCar(List<Mechanic> mechanics) {
        System.out.println("Механики : ");
        for (Mechanic value : mechanic) {
            if (value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_BUS || value.getAbilityToWorkCars() == AbilityToWorkCars.ABILITY_UNIVERSAL) {
                System.out.println("- " + value);
            }
            System.out.println("производят регулярное ТО на автомобиле " + getBrand() + " " + getModel());
        }
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


