package extends1.ex2;

// extends Car 사용 시 Car 클래스의 기능을 다 물려받음
// 단일 상속만 가능 = 두 부모 모두 동일한 이름의 메서드가 있을 때 어떤 메서드를 사용할 지 결정 못하므로
// 여러 상속이 필요한 경우 부모의 부모를 사용

// * 상속을 받으면 단순히 부모의 필드와 메서드만 물려받는게 아니라, 자식 클래스에 부모 클래스 자체를 함께 포함해서 생성됨
// * electricCar.move() 호출 시 먼저 자식 클래스에서 메서드를 탐색한 후 없으면 부모 클래스 메서드 탐색
public class ElectricCar extends Car {
    // move 메서드 만들 필요 X
    public void charge() {
        System.out.println("충전합니다.");
    }
}