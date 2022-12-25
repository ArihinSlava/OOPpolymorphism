import Driver.Driver;
import Driver.CarDriver;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;



public class Main {

    public static void main(String[] args) {

        Car skoda = new Car("Skoda", "Octavia", 2.0);
        Car audi = new Car("Audi", "A4", 2.5);
        Car nissan = new Car("Nissan", "Qashqai", 2.0);
        Car bmw = new Car("BMW", "X6", 4.5);


        Truck kamaz = new Truck("Kamaz", "Master", 3.5);
        Truck mercedesTruck = new Truck("Mercedes", "Daimler", 3.5);
        Truck valdai = new Truck("Valdai", "Next", 2.5);
        Truck gazel = new Truck("Gazel", "NN", 3.0);

        Bus ikarus = new Bus("Икарус", "Z50", 2.0);
        Bus liaz = new Bus("Лиаз", "Гармошка", 2.5);
        Bus man = new Bus("Man", "А24", 3.5);
        Bus mercedesBus = new Bus("Mercedes", "Sprinter", 2.5);


        printCarInfo(skoda);
        printCarInfo(audi);
        printCarInfo(nissan);
        printCarInfo(bmw);
        printTruckInfo(kamaz);
        printTruckInfo(mercedesTruck);
        printTruckInfo(valdai);
        printTruckInfo(gazel);
        printBusInfo(ikarus);
        printBusInfo(liaz);
        printBusInfo(man);
        printBusInfo(mercedesBus);

        skoda.pitStop();
        audi.getBestLapTime();
        ikarus.getMaxSpeed();


        CarDriver<Car> mihail = new CarDriver<>("Михаил", "Михайлович", "Михайлов", "B", 10);
        mihail.drive(skoda);


    }





    public static void printCarInfo(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " Мощность двигателя " + car.getEngineCapacity());
    }

    public static void printBusInfo(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " Мощность двигателя " + bus.getEngineCapacity());
    }

    public static void printTruckInfo(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " Мощность двигателя " + truck.getEngineCapacity());
    }
}