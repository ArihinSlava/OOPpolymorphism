package transport;

import mechanic.Mechanic;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineCapacity;

    List<Mechanic> mechanic;

    List<Transport> transports;

    Map<Transport, Mechanic> hashMap;



    public Transport(String brand, String model, double engineCapacity) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        }

        this.engineCapacity = engineCapacity;
    }

    public Transport(String brand, String model, double engineCapacity, List<Mechanic> mechanic) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.mechanic = mechanic;

    }

    public Transport(String brand, String model, double engineCapacity, List<Mechanic> mechanic, List<Transport> transports) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.mechanic = mechanic;
        this.transports = transports;
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public abstract void passDiagnostics();

    public abstract void performMaintenance(List<Mechanic> mechanics);

    public abstract void fixTheCar(List<Mechanic> mechanics);


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }


    @Override
    public String toString() {
        return "Транспорстрое стредство: " + brand + " " + model + " " +
                ". Мощность двигателя " + engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }

    }
}
