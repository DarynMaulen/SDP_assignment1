package first_builder_example;

public class Usage {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new SportsCarBuilder();
        Car car = director.construct(builder);
        System.out.println(car);
    }
}
