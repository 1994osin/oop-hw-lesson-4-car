package driver;

import transport.Car;

public abstract class Driver<D extends Car> {

    private String fullName;
    private boolean driversLicense;
    private int seniority;

    public Driver(String fullName, boolean driversLicense, int seniority) {
        setFullName(fullName);
        this.driversLicense = driversLicense;
        this.seniority = seniority;
    }

    public abstract void startMoving(D car);

    public abstract void stopMoving(D car);

    public abstract void tuckIn(D car);

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = (fullName == null || fullName.isBlank()) ? "ФИО" : fullName;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = (seniority <= 0) ? 1 : seniority;
    }
}
