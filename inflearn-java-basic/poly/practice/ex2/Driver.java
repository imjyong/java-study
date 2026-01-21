package poly.practice.ex2;

public class Driver {
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        System.out.println("운전을 시작합니다.");
        vehicle.start();
        vehicle.move();
        vehicle.stop();
    }
}
