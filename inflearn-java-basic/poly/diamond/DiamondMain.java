package poly.diamond;

public class DiamondMain {
    static void main(String[] args) {
        // 인터페이스는 인스턴스 생성 불가
        // 부모 타입 = 자식 타입으로 인스턴스 생성
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
