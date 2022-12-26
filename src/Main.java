import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverD;
import transport.Sponsor;
import transport.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Mechanic<Car> petr = new Mechanic<>("Петр", "Петров", "comp1");
        Mechanic<Car> roman = new Mechanic<>("Роман", "Романов", "comp2");
        Mechanic<Car> andrey = new Mechanic<>("Андрей", "Андреев", "comp2");
        Sponsor sponsor1 = new Sponsor("sponsor1", 10000);
        Sponsor sponsor2 = new Sponsor("sponsor1", 20000);

        PassengerCar car1 = new PassengerCar("car1", "c1", 2.0, PassengerCar.BodyType.SEDAN);
        car1.addDriver(new DriverB("Иванов И.И.", true, 5));
        car1.addMechanics(petr);
        car1.addSponsor(sponsor1, sponsor2);


        Truck truck1 = new Truck("truck1", "t1", 5.0, Truck.LoadCapacity.NUMBER1);
        truck1.addDriver(new DriverB("Петров П.П.", true, 10));
        truck1.addMechanics(roman);
        truck1.addSponsor(sponsor2);

        Bus bus1 = new Bus("bus1", "b1", 3.0, Bus.Capacity.BIG);
        bus1.addDriver(new DriverD("Романов Р.Р.", true, 15));
        bus1.addMechanics(petr);
        bus1.addSponsor(sponsor1, sponsor2);;

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(car1);
        serviceStation.addTruck(truck1);
        serviceStation.service();
        serviceStation.service();

        List<Car> cars = List.of(car1, truck1, bus1);

        for (Car car : cars) {
            printInfo(car);
        }



    }

    private static void printInfo(Car car) {
        System.out.println("Инфо по авто " + car.getBrand() + " " + car.getModel());
        System.out.println("Водители: ");
        for (Driver<?> driver : car.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic : car.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname());
        }
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : car.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println();
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