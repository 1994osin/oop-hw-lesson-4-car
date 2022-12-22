package transport;

public abstract class Car {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Car(String brand, String model, double engineVolume) {
        this.brand = (brand == null || brand.isBlank()) ? "default" : brand;
        this.model = (model == null || model.isBlank()) ? "default" : model;
        setEngineVolume(engineVolume);
    }

    public abstract void startMoving();

    public abstract void endOfMovement();

    public abstract void printType();

    public abstract boolean service();

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
}
