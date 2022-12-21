package driver;

import transport.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, boolean driversLicense, int seniority) {
        super(fullName, driversLicense, seniority);
    }

    @Override
    public void startMoving(Bus bus) {
        bus.startMoving();
    }

    @Override
    public void stopMoving(Bus bus) {
        bus.endOfMovement();
    }

    @Override
    public void tuckIn(Bus bus) {
        System.out.println("Водитель " + getFullName() + " заправил автомобиль "
                + bus.getBrand() + " " + bus.getModel());
    }
}
