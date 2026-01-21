package poly.practice.ex1;

public class Driver {
    private Bus bus;
    private Taxi taxi;

    public void setBus (Bus bus) {
        this.bus = bus;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public void drive() {
        System.out.println("운전을 시작합니다.");

        if (bus != null) {
            bus.start();
            bus.move();
            bus.stop();
        } else if (taxi != null) {
            taxi.start();
            taxi.move();
            taxi.stop();
        }
    }
}
