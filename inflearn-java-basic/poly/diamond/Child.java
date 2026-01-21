package poly.diamond;

// 인터페이스는 다중 구현 허용
public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // methodCommon() 메서드는 InterfaceA, B 모두 존재하므로 하나만 오버라이딩
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
