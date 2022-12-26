package transport.driver;

import transport.PassengerCar;

public class DriverB extends Driver<PassengerCar> {

    public DriverB(String fullName, boolean driversLicense, int seniority) throws Exception {
        super(fullName, driversLicense, seniority);
    }

    @Override
    public void startMoving(PassengerCar passengerCar) {
        passengerCar.startMoving();
    }

    @Override
    public void stopMoving(PassengerCar passengerCar) {
        passengerCar.endOfMovement();
    }

    @Override
    public void tuckIn(PassengerCar passengerCar) {
        System.out.println("Водитель " + getFullName() + " заправил автомобиль "
                + passengerCar.getBrand() + " " + passengerCar.getModel());
    }
}
