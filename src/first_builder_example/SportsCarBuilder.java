package first_builder_example;

public class SportsCarBuilder implements CarBuilder{
    private Car car = new Car();
    @Override
    public void setManufacturer(String manufacturer){
        car.setManufacturer(manufacturer);
    };
    @Override
    public void setModel(String model){
        car.setModel(model);
    };
    @Override
    public void setYear(int year){
        car.setYear(year);
    };
    @Override
    public void setBodyType(String bodyType){
        car.setBodyType(bodyType);
    };
    @Override
    public void setEngine(String engine){
        car.setEngine(engine);
    };
    @Override
    public void setColor(String color){
        car.setColor(color);
    }

    @Override
    public Car build() {
        return car;
    }
}
