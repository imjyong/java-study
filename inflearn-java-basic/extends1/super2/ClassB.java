package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        // 첫 줄 super 메서드를 주석처리하고 this(a, 0) 메서드를 호출하는 경우
        // this(a, 0)로 ClassB(int a, int b) 호출을 한 뒤 종료되면 Class B 생성자 a = 100도 호출함
        // this(a, 0);

        super(); // 부모 클래스의 기본 생성자는 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 부모 클래스의 기본 생성자는 생략 가능
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
