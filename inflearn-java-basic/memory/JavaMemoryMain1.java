package memory;

public class JavaMemoryMain1 {
    // 자바는 스택 영역을 사용하여 메서드와 지역 변수를 관리
    // 메서드는 스택(LIFO) 구조로 진행됨
    static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
