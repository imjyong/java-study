package poly.car0;

/*
K3 차량을 운전하던 운전자가 Model 3로 차량을 변경해서 운전하는 코드
자동차가 늘어나는데 자동차 운전자의 코드를 계속 고쳐야 함 = 역할과 구현을 분리하지 않았기 때문
다형성을 활용하여 역할과 구현을 분리해서, 클라이언트 코드의 변경 없이 구현 객체를 변경하자
*/

public class CarMain0 {
    static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // K3Car의 참조 제거
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
