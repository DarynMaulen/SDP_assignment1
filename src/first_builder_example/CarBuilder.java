package first_builder_example;

public interface CarBuilder {
    void setManufacturer(String manufacturer);
    void setModel(String model);
    void setYear(int year);
    void setBodyType(String bodyType);
    void setEngine(String engine);
    void setColor(String color);
    // Returns the final Car
    Car build();
}
