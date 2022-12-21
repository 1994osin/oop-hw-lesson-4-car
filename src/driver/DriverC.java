package driver;


import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, boolean driversLicense, int seniority) {
        super(fullName, driversLicense, seniority);
    }

    @Override
    public void startMoving(Truck truck) {
        truck.startMoving();
    }

    @Override
    public void stopMoving(Truck truck) {
        truck.endOfMovement();
    }

    @Override
    public void tuckIn(Truck truck) {
        System.out.println("Водитель " + getFullName() + " заправил автомобиль "
                + truck.getBrand() + " " + truck.getModel());
    }
}
