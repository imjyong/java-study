package poly.car1;

public class CarMain1 {
    static void main(String[] args) {
        // 클라이언트 = Driver, 서버 = Car
        Driver driver = new Driver();

        // 차량 선택 (K3)
        K3Car k3Car = new K3Car();
        // Car 타입 인스턴스이므로 Car 인터페이스에 먼저 갔다가 오버라이딩 된 클래스 메서드로 이동
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경 (Model 3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경 (Model 3)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
