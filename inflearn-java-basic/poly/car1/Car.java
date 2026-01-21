package poly.car1;

// Driver는 Car의 역할에만 (= 인터페이스) 의존하며, 구현인 K3, Model3 자동차에 (= 인터페이스 구현) 의존 X

public interface Car {
    void startEngine();
    void offEngine();
    void pressAccelerator();
}