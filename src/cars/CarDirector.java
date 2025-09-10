package cars;

public class CarDirector {
    public Car construct(CarBuilder builder){
        builder.setManufacture("Ferrari");
        builder.setModel("488 GTB");
        builder.setYear(2022);
        builder.setBodyType("Coupe");
        builder.setEngine("V8 Twin Turbo");
        builder.setColor("Red");
        return builder.build();
    };
}
