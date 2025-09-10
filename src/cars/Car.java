package cars;

public class Car {
    private String manufacture;
    private String model;
    private int year;
    private String bodyType;
    private String engine;
    private String color;

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
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

    public int getYear() {
        return year;
    }

    public String getManufacture() {
        return manufacture;
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

    @Override
    public String toString() {
        return "Car {" +
                "manufacture='" + manufacture +
                ", model='" + model +
                ", year=" + year +
                ", bodyType='" + bodyType +
                ", engine='" + engine +
                ", color='" + color +
                '}';
    }

}
