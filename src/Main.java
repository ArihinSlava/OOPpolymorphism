import driver.Driver;
import transport.*;


public class Main {

    public static void main(String[] args) {

        Car skoda = new Car("Skoda", "Octavia", 2.0, BodyType.BODY_TYPE_SEDAN);
        Car audi = new Car("Audi", "A4", 2.5, BodyType.BODY_TYPE_HATCHBACK);
        Car nissan = new Car("Nissan", "Qashqai", 2.0, BodyType.BODY_TYPE_CROSSOVER);
        Car bmw = new Car("BMW", "X6", 4.5, BodyType.BODY_TYPE_OFFROAD);


        Truck kamaz = new Truck("Kamaz", "Master", 3.5, LoadCapacity.LOAD_CAPACITY_N3);
        Truck mercedesTruck = new Truck("Mercedes", "Daimler", 3.5,LoadCapacity.LOAD_CAPACITY_N1);
        Truck valdai = new Truck("Valdai", "Next", 2.5,LoadCapacity.LOAD_CAPACITY_N1);
        Truck gazel = new Truck("Gazel", "NN", 3.0,LoadCapacity.LOAD_CAPACITY_N3);

        Bus ikarus = new Bus("Икарус", "Z50", 2.0,Capacity.EXTRA_LARGE);
        Bus liaz = new Bus("Лиаз", "Гармошка", 2.5,Capacity.LARGE);
        Bus man = new Bus("Man", "А24", 3.5,Capacity.MEDIUM);
        Bus mercedesBus = new Bus("Mercedes", "Sprinter", 2.5,null);


        System.out.println(skoda);
        System.out.println(audi);
        System.out.println(kamaz);
        System.out.println(mercedesTruck);
        System.out.println(valdai);
        System.out.println(ikarus);
        System.out.println(man);
        System.out.println(nissan);
        System.out.println(bmw);
        System.out.println(gazel);
        System.out.println(liaz);
        System.out.println(mercedesBus);
        skoda.pitStop();
        audi.getBestLapTime();
        ikarus.getMaxSpeed();
        audi.printType();
        mercedesBus.printType();
        man.printType();
        valdai.printType();

        Driver<Car> mihail = new Driver<>("Иван", "Иванович", "Иванов", "B", 10);
        Driver<Bus> slava = new Driver<>("Вячеслав", "Леонидович", "Арихин", "D", 20);
        Driver<Truck> valerii = new Driver<>("Валерий", "Анатольевич", "Луценко", "С", 15);
        mihail.drive(skoda);
        slava.drive(man);
        valerii.drive(kamaz);


    }
}