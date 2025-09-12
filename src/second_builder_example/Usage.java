package second_builder_example;

import first_builder_example.CarBuilder;
import first_builder_example.CarDirector;
import first_builder_example.SportsCarBuilder;

public class Usage {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setManufacturer("Ferrari")
                .setModel("488 GTB")
                .setYear(2022)
                .setBodyType("Coupe")
                .setEngine("V8 Twin Turbo")
                .setColor("Red")
                .build();
        System.out.println(sportsCar);
    }
}
