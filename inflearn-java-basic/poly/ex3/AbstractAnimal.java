package poly.ex3;

// 추상 클래스 = 상속을 목적으로 사용되어, 실체인 인스턴스가 생성되면 안되는 클래스
// 추상 메서드가 하나라도 있는 클래스는 반드시 추상 클래스로 선언해야 함
public abstract class AbstractAnimal {
    // 추상 메서드는 바디 {} 가 없어야 함
    // 추상 메서드는 상속받는 자식 클래스가 반드시 오버라이딩해서 사용해야 함
    // 오버라이딩 하지 않을 경우 자식도 추상 클래스가 되어야 함
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
