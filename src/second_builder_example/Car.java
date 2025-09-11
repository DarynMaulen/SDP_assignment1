package second_builder_example;

public class Car {
    private final String manufacturer;
    private final String model;
    private final int year;
    private final String bodyType;
    private final String engine;
    private final String color;

    private Car(String manufacturer,String model,int year,
                String bodyType,String engine,String color){
        this.manufacturer=manufacturer;this.model=model;this.year=year;
        this.bodyType=bodyType;this.engine=engine;this.color=color;
    }

    public static class Builder {
        private String manufacturer;
        private String model;
        private int year;
        private String bodyType;
        private String engine;
        private String color;

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer; return this;
        }
        public Builder setModel(String model) {
            this.model = model; return this;
        }
        public Builder setYear(int year) {
            this.year = year; return this;
        }
        public Builder setBodyType(String bodyType) {
            this.bodyType = bodyType; return this;
        }
        public Builder setEngine(String engine) {
            this.engine = engine; return this;
        }
        public Builder setColor(String color) {
            this.color = color; return this;
        }

        public Car build() {
            return new Car(manufacturer, model, year, bodyType, engine, color);
        }
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
