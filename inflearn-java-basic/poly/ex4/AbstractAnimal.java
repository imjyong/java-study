package poly.ex4;

// 순수 추상 클래스 = 클래스 내 모든 메서드가 추상 메서드
// 다형성을 위한 부모 타입으로써 껍데기 역할만 제공
// 자식 클래스는 부모의 기능을 물려받는다기보다 규격에 맞춰 구현하는 역할 = 인터페이스 역할과 유사
public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();
}
