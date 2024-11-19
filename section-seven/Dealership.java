import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; ++i) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public Car[] getCars() {
        return Arrays.copyOf(this.cars, this.cars.length);
    }

    public void setCars(Car[] cars) {
        this.cars = Arrays.copyOf(cars, cars.length);
    }

    public Car getCar(int index) {
        Car copyCar = new Car(cars[index]);
        return copyCar;
    }

    public void setCar(int index, Car newCar) {
        Car copyCar = new Car(newCar);
        this.cars[index] = copyCar;
    }

    public void sell(int index) {
        this.cars[index].drive();
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }

}
