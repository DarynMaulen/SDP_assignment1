package second_builder_example;

public class Usage {
    Car sportsCar = new Car.Builder()
            .setManufacturer("Ferrari")
            .setModel("488 GTB")
            .setYear(2022)
            .setBodyType("Coupe")
            .setEngine("V8 Twin Turbo")
            .setColor("Red")
            .build();
}
