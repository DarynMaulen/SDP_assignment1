package first_builder_example;

public class CarDirector {
    public Car construct(CarBuilder builder){
        builder.setManufacturer("Ferrari");
        builder.setModel("488 GTB");
        builder.setYear(2022);
        builder.setBodyType("Coupe");
        builder.setEngine("V8 Twin Turbo");
        builder.setColor("Red");
        return builder.build();
    };
}
