package poly.practice.ex2;

public class Taxi implements Vehicle {
    @Override
    public void start() {
        System.out.println("택시 출발");
    }

    @Override
    public void move() {
        System.out.println("택시 출발");
    }

    @Override
    public void stop() {
        System.out.println("택시 정지");
    }
}
