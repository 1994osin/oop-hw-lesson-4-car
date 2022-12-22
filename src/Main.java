import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

public class Main {
    public static void main(String[] args) throws Exception {

        PassengerCar car1 = new PassengerCar("car1", "c1", 2.0, PassengerCar.BodyType.SEDAN);
        PassengerCar car2 = new PassengerCar("car2", "c2", 2.2, null);
        PassengerCar car3 = new PassengerCar("car3", "c3", 2.4, PassengerCar.BodyType.SUV);
        PassengerCar car4 = new PassengerCar("car4", "c4", 2.6, PassengerCar.BodyType.HATCHBACK);

        Truck truck1 = new Truck("truck1", "t1", 5.0, Truck.LoadCapacity.NUMBER1);
        Truck truck2 = new Truck("truck2", "t2", 5.2, Truck.LoadCapacity.NUMBER2);
        Truck truck3 = new Truck("truck3", "t3", 5.4, Truck.LoadCapacity.NUMBER3);
        Truck truck4 = new Truck("truck4", "t4", 5.6, Truck.LoadCapacity.NUMBER1);

        Bus bus1 = new Bus("bus1", "b1", 3.0, Bus.Capacity.BIG);
        Bus bus2 = new Bus("bus2", "b2", 3.2, Bus.Capacity.VERY_BIG);
        Bus bus3 = new Bus("bus3", "b3", 3.4, Bus.Capacity.SMALL);
        Bus bus4 = new Bus("bus4", "b4", 3.6, null);

        DriverB driverB = new DriverB("Иванов И.И.", true, 5);
        DriverC driverC = new DriverC("Петров П.П.", true, 10);
        DriverD driverD = new DriverD("Романов Р.Р.", true, 15);

//        driverB.startMoving(car1);
//        driverB.stopMoving(car1);
//        driverB.tuckIn(car1);
//
//        driverC.startMoving(truck2);
//        driverC.stopMoving(truck2);
//        driverC.tuckIn(truck2);
//
//        driverD.startMoving(bus4);
//        driverD.stopMoving(bus4);
//        driverD.tuckIn(bus4);

//        car1.printType();
//        car2.printType();
//        car3.printType();
//        car4.printType();

//        truck1.printType();
//        truck2.printType();
//        truck3.printType();
//        truck4.printType();

//        bus1.printType();
//        bus2.printType();
//        bus3.printType();
//        bus4.printType();

        service(car1, car2, car3, car4, truck1, truck2, truck3, truck4, bus1, bus2, bus3, bus4);
    }

    private static void service(Car... cars) {
        for (Car car : cars) {
            serviceTransport(car);
        }
    }

    private static void serviceTransport(Car car) {
        try {
            if (!car.service())
                throw new Exception("Автомобиль " + car.getBrand() + " " + car.getModel() + " не прошел диагностику!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}