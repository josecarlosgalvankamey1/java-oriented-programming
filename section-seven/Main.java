public class Main {
    public static void main(String[] args) {

        String[] spareParts = { "Tires", "Keys" };

        Car nissan = new Car("Nissan", 10000, 2020, "gray", spareParts);

        System.out.println(nissan);
        // Car nissan2 = new Car(nissan);

        // String[] nissan2Parts = nissan2.getParts();
        // nissan2Parts[0] = "filter";

        // nissan.make = "Nissan";
        // nissan.price = 10000;
        // nissan.year = 2020;
        // nissan.color = "gray";

        // Car dodge = new Car("Dodge", 11000, 2019, "blue", spareParts);

        // dodge.make = "Dodge";
        // dodge.price = 11000;
        // dodge.year = 2019;
        // dodge.color = "blue";

        // printCarDetails(nissan);
        // printCarDetails(nissan2);
        // printCarDetails(dodge);

        // nissan.setColor("Jet Black");
        // dodge.setColor("Jet Black");

        // nissan2.setColor("Yellow");
        // nissan.setColor("Orange");
        // nissan2.setColor("Blue");
        // nissan.setColor("Purple");
        // nissan2.setColor("Fuchsia");
        // nissan.setColor("Beige");

        // nissan.setPrice(nissan.getPrice() / 2);
        // dodge.setPrice(dodge.getPrice() / 2);

        // printCarDetails(nissan);
        // printCarDetails(nissan2);
        // printCarDetails(dodge);

        // nissan2.drive();
    }

    public static void printCarDetails(Car car) {
        System.out.println("This " + car.getMake() + " is worth $" + car.getPrice() +
                ". It was built in " + car.getYear() + ". It is " + car.getColor() + ".\n");
    }
}