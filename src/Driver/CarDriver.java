package Driver;

import Transport.Transport;
import Transport.Competing;

public class CarDriver <T extends Transport & Competing> extends Driver {
    public CarDriver(String firstName, String middleName, String endName, String driverLicense, int experience) {
        super(firstName, middleName, endName, driverLicense, experience);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void drive(T transport) {
        System.out.println("Водитель ФИО" + getEndName() + " " + getMiddleName() + " "  + getFirstName() +
                ". Управляет транспортным средством " + transport.getBrand() + " " + transport.getModel() +
                ". Будет учавстовать в заезде. ");
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории Б начинает движение");

    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории Б заканчивает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель с правами категории Б заправляет транспортное средство.");
    }
}




