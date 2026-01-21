package poly.ex5;

/*
클래스 -> 인터페이스
클래스는 '상속'한다고 하지만, 인터페이스는 '구현'한다고 함
public abstract class = public interface (축약)
public abstract void 메서드명 = void 메서드명 (생략)
 */

// 추상 클래스 = 추상 메서드가 아닌 메서드의 생성이 가능하며, 이는 자식 클래스에서 반드시 오버라이딩 되지 않아도 됨
// 인터페이스 = 모든 추상 메서드를 자식 클래스에서 반드시 구현해야 함

public interface InterfaceAnimal {
    // 멤버 변수 = public static final 자료형 상수명, 이때 public static final 생략
    // 인터페이스는 보통 여러 곳에서 사용하는 목적으로 만들어지기 때문에 접근 제어자로 public 사용

    void sound();
    void move();
}
