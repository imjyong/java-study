package poly.overriding;

public class Child extends Parent {
    // 멤버 변수는 부모 클래스와 이름이 같더라도 오버라이딩 되지 않고 따로 생성됨
    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
