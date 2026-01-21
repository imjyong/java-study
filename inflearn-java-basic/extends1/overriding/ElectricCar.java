package extends1.overriding;

public class ElectricCar extends Car {
    // 오버로드 = 같은 메서드명 + 다른 매개변수
    // 오버라이드 = 부모 메서드를 자식이 재정의

    // 상위 클래스 메서드가 protected로 선언되어 있으면 하위 클래스는 public, protected로만 오버라이드 가능
    // static 타입은 오버라이드 불가능 = 오버라이드는 인스턴스 레벨에서 작동
    @Override // 애노테이션 생략 가능하지만 생략 안하는 게 관례
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}