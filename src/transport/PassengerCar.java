package transport;

public class PassengerCar extends Car implements Competing {

    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"), UNIVERSAL("Универсал"), SUV("Внедорожник"),
        CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

        String bodyType;
        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "тип кузова: " + bodyType;
        }
    }

    private BodyType bodyType;

    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
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
        return (int) (Math.random() * 5);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 300);
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println("У " + getBrand() + " " + getModel() + " " + bodyType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
