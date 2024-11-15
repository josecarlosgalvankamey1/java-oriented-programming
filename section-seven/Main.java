public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "gray");

        // nissan.make = "Nissan";
        // nissan.price = 10000;
        // nissan.year = 2020;
        // nissan.color = "gray";

        Car dodge = new Car("Dodge", 11000, 2019, "blue");

        // dodge.make = "Dodge";
        // dodge.price = 11000;
        // dodge.year = 2019;
        // dodge.color = "blue";

        printCarDetails(nissan);
        printCarDetails(dodge);

        nissan.setColor("Jet  Black");
        dodge.setColor("Jet Black");

        nissan.setPrice(nissan.getPrice() / 2);
        dodge.setPrice(dodge.getPrice() / 2);

        printCarDetails(nissan);
        printCarDetails(dodge);

    }

    public static void printCarDetails(Car car) {
        System.out.println("This " + car.getMake() + " is worth $" + car.getPrice() +
                ". It was built in " + car.getYear() + ". It is " + car.getColor() + ".\n");
    }
}