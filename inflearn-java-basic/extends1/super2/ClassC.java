package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        /*
        상속 관계에서 자식 클래스의 생성자 첫 줄에는 반드시 부모 클래스의 생성자를 super 메서드로 호출해야 함
        첫 줄에 예외로 this 메서드 호출은 가능 = 즉, 해당 클래스 내 다른 메서드를 this(a, 0) 꼴로 호출은 가능
        그러나 마지막 호출에서는 꼭 super 메서드를 호출해야 함
         */

        // classB에서는 생성자를 직접 정의했으므로 기본 생성자로 호출 불가
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
