package cars;
import cars.CarBuilder;
import cars.CarDirector;
import cars.SportsCarBuilder;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new SportsCarBuilder();
        Car car = director.construct(builder);
        System.out.println(car);
    }
}
