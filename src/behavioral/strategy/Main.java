package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Car car = new BMW(new FlyCar());
        car.fly();
        Car track = new Track(new NoFlyCar());
        track.fly();
    }
}