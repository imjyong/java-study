package final1;

public class FinalLocalMain {
    static void main(String[] args) {
        // final 지역 변수1
        final int data1 = 10; // 최초 1번 할당 가능
        // data1 = 20; // 컴파일 오류

        method(10);
    }

    // 매개변수에 final 변수 넣을 수 있음
    static void method(final int parameter) {
        // parameter = 20; // 변경 불가
    }
}
