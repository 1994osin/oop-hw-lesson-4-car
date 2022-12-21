package transport;

public class Bus extends Car implements Competing {

    public enum Capacity {

        VERY_SMALL(null, 10), SMALL(null, 25), MEDIUM(40, 50), BIG(60, 80), VERY_BIG(100, 120);

        final Integer i1;
        final Integer i2;

        Capacity(Integer i1, int i2) {
            this.i1 = i1;
            this.i2 = i2;
        }

        Capacity(int i1, int i2) {
            this.i1 = i1;
            this.i2 = i2;
        }

        @Override
        public String toString() {
            if (i1 == null) {
                return "вместимость: до " + i2 + " мест";
            } else {
                return "вместимость: от " + i1 + " до " + i2 + " мест";
            }
        }
    }

    Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
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
        return (int) (Math.random() * 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 150);
    }

    @Override
    public void printType() {
        if (capacity != null) {
            System.out.println("У " + getBrand() + " " + getModel() + " " + capacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
