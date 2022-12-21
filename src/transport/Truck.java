package transport;

public class Truck extends Car implements Competing {

    public enum LoadCapacity {
        NUMBER1(null, 3.5F), NUMBER2(3.5F, 12F), NUMBER3(12F, null);

        final Float v1;
        final Float v2;

        LoadCapacity(Float v1, float v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        LoadCapacity(float v1, float v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        LoadCapacity(float v1, Float v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        @Override
        public String toString() {
            if (v1 == null) {
                return "грузоподъемность: до " + v2 + " тонн";
            } else if (v2 == null) {
                return "грузоподъемность: от " + v1 + " тонн";
            } else {
                return "грузоподъемность: от " + v1 + " до " + v2 + " тонн";
            }
        }
    }

    LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void endOfMovement() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() * 10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 200);
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println("У " + getBrand() + " " + getModel() + " " + loadCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
