package cars;

public interface CarBuilder {
    void setManufacture(String manufacture);
    void setModel(String model);
    void setYear(int year);
    void setBodyType(String bodyType);
    void setEngine(String engine);
    void setColor(String color);
    Car build();
}
