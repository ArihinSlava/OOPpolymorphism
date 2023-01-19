import driver.Driver;
import mechanic.AbilityToWorkCars;
import mechanic.Mechanic;
import transport.*;

import java.util.*;


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


//        System.out.println(skoda);
//        System.out.println(audi);
//        System.out.println(kamaz);
//        System.out.println(mercedesTruck);
//        System.out.println(valdai);
//        System.out.println(ikarus);
//        System.out.println(man);
//        System.out.println(nissan);
//        System.out.println(bmw);
//        System.out.println(gazel);
//        System.out.println(liaz);
//        System.out.println(mercedesBus);
//        skoda.pitStop();
//        audi.getBestLapTime();
//        ikarus.getMaxSpeed();
//        audi.printType();
//        mercedesBus.printType();
//        man.printType();
//        valdai.printType();
//        mercedesTruck.passDiagnostics();
//        skoda.passDiagnostics();
//        ikarus.passDiagnostics();


        Driver<Car> mihail = new Driver<>("Иван", "Иванович", "Иванов", "B", 10);
        Driver<Bus> slava = new Driver<>("Вячеслав", "Леонидович", "Арихин", "D", 20);
        Driver<Truck> valerii = new Driver<>("Валерий", "Анатольевич", "Луценко", "С", 15);
//        mihail.drive(skoda);
//        slava.drive(man);
//        valerii.drive(kamaz);

        List<Transport> transports = new ArrayList<>();
        transports.add(skoda);
        transports.add(audi);
        transports.add(nissan);
        transports.add(bmw);
        transports.add(kamaz);
        transports.add(mercedesTruck);
        transports.add(valdai);
        transports.add(gazel);
        transports.add(ikarus);
        transports.add(liaz);
        transports.add(man);
        transports.add(mercedesBus);
        transports.forEach(System.out::println);


        Mechanic mechanic = new Mechanic("Alexandr", "Alexandrov", "Rolph", AbilityToWorkCars.ABILITY_CARS);
        Mechanic mechanic1 = new Mechanic("Ivan", " Ivanov ", "Alpha", AbilityToWorkCars.ABILITY_TRUCK);
        Mechanic mechanic2 = new Mechanic("Vasiliy", "Vasilev", "Hoff", AbilityToWorkCars.ABILITY_BUS);
        Mechanic mechanic3 = new Mechanic("Mihail", "Mihailov", "Cargo", AbilityToWorkCars.ABILITY_UNIVERSAL);
        Mechanic mechanic4 = new Mechanic("Andrei", "Andreev", "Motors", AbilityToWorkCars.ABILITY_CARS);

        List<Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(mechanic);
        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);
        mechanicList.add(mechanic4);
        mechanicList.forEach(System.out::println);



        Car skoda1 = new Car("Skoda", "Octavia", 2.0, mechanicList , BodyType.BODY_TYPE_SEDAN);
        Car audi1 = new Car("Audi", "A4", 2.5, mechanicList , BodyType.BODY_TYPE_HATCHBACK);
        Car nissan1 = new Car("Nissan", "Qashqai", 2.0, mechanicList , BodyType.BODY_TYPE_CROSSOVER);
        Car bmw1 = new Car("BMW", "X6", 4.5, mechanicList ,BodyType.BODY_TYPE_OFFROAD);

        Truck kamaz1 = new Truck("Kamaz", "Master", 3.5,mechanicList, LoadCapacity.LOAD_CAPACITY_N3);
        Truck mercedesTruck1 = new Truck("Mercedes", "Daimler", 3.5,mechanicList, LoadCapacity.LOAD_CAPACITY_N1);
        Truck valdai1 = new Truck("Valdai", "Next", 2.5,mechanicList,LoadCapacity.LOAD_CAPACITY_N1);
        Truck gazel1 = new Truck("Gazel", "NN", 3.0,mechanicList,LoadCapacity.LOAD_CAPACITY_N3);

        Bus ikarus1 = new Bus("Икарус", "Z50", 2.0, mechanicList, Capacity.EXTRA_LARGE);
        Bus liaz1 = new Bus("Лиаз", "Гармошка", 2.5, mechanicList , Capacity.LARGE);
        Bus man1 = new Bus("Man", "А24", 3.5, mechanicList , Capacity.MEDIUM);
        Bus mercedesBus1 = new Bus("Mercedes", "Sprinter", 2.5, mechanicList,null);

        List<Transport> transports1 = new ArrayList<>();
        transports1.add(skoda1);
        transports1.add(audi1);
        transports1.add(nissan1);
        transports1.add(bmw1);
        transports1.add(kamaz1);
        transports1.add(mercedesTruck1);
        transports1.add(valdai1);
        transports1.add(gazel1);
        transports1.add(ikarus1);
        transports1.add(liaz1);
        transports1.add(man1);
        transports1.add(mercedesBus1);
        transports1.forEach(System.out::println);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(mihail);
        drivers.add(slava);
        drivers.add(valerii);
        drivers.forEach(System.out::println);

        skoda1.performMaintenance(mechanicList);
        man1.performMaintenance(mechanicList);
        valdai1.performMaintenance(mechanicList);
        audi1.fixTheCar(mechanicList);
        valdai1.fixTheCar(mechanicList);
        man1.fixTheCar(mechanicList);

        Map<Transport, Mechanic> hashMap = new HashMap<>();
        hashMap.put(skoda1, mechanic);
        hashMap.put(audi1, mechanic);
        hashMap.put(kamaz1, mechanic1);
        hashMap.put(valdai1, mechanic1);
        hashMap.put(liaz1, mechanic2);
        hashMap.put(ikarus1, mechanic2);
        hashMap.put(ikarus1, mechanic2);

        for (Map.Entry<Transport, Mechanic> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }


        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(mihail);
        driverSet.add(slava);
        driverSet.add(valerii);

        for (Driver driver : driverSet) {
            System.out.println(driver);
        }

        System.out.println("___________");
        Iterator<Driver> iterator = driverSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}