package poly.practice.ex2;

public class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("버스 출발");
    }

    @Override
    public void move() {
        System.out.println("버스 출발");
    }

    @Override
    public void stop() {
        System.out.println("버스 정지");
    }
}
