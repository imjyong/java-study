package extends1.ex2;

public class CarMain {
    static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        // 부모 클래스 기능 사용
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        // 부모 클래스 기능 사용
        gasCar.move();
        gasCar.fillUp();
    }
}
