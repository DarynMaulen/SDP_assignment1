package first_builder_example;

// Simple mutable Car class
public class Car {
    private String manufacturer;
    private String model;
    private int year;
    private String bodyType;
    private String engine;
    private String color;

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "first_builder_example.Car {" +
                "manufacturer = " + manufacturer +
                ", model = " + model +
                ", year = " + year +
                ", bodyType = " + bodyType +
                ", engine = " + engine +
                ", color = " + color +
                '}';
    }
}
