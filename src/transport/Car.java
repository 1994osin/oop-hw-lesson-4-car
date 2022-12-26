package transport;

import transport.driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, double engineVolume) {
        this.brand = (brand == null || brand.isBlank()) ? "default" : brand;
        this.model = (model == null || model.isBlank()) ? "default" : model;
        setEngineVolume(engineVolume);
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanics(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }


    public abstract void startMoving();

    public abstract void endOfMovement();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
