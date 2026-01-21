package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지
        // defaultValue = 1; // 다른 패키지 접근 불가
        // privateValue = 1; // 접근 불가

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        // printParent 메서드 자체는 public이며, 해당 메서드는 본인 클래스 내 모든 메서드 호출 가능
        printParent();
    }
}
