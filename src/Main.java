import driver.Driver;
import transport.Bus;
import transport.Car;
import transport.Truck;



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


        System.out.println(skoda);
        System.out.println(audi);
        System.out.println(kamaz);
        System.out.println(mercedesTruck);
        System.out.println(valdai);
        System.out.println(ikarus);
        System.out.println(man);
        skoda.pitStop();
        audi.getBestLapTime();
        ikarus.getMaxSpeed();

        Driver<Car> mihail = new Driver<>("Иван", "Иванович", "Иванов", "B", 10);
        Driver<Bus> slava = new Driver<>("Вячеслав", "Леонидович", "Арихин", "D", 20);
        Driver<Truck> valerii = new Driver<>("Валерий", "Анатольевич", "Луценко", "С", 15);
        mihail.drive(skoda);
        slava.drive(man);
        valerii.drive(kamaz);


    }
}