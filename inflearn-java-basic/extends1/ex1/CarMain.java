package extends1.ex1;

public class CarMain {
    static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // 전기차와 가솔린차는 자동차의 하위 개념 = 자동차를 부모로 설정
        // 전기차든 가솔린차든 주유하는 방식만 다를 뿐 이동하는 것은 같음 = 상속 관계
    }
}
