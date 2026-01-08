package method.ex;

public class MethodEx2 {
    static void main(String[] args) {
        String msg = "Hello, world!"; // 인자로 전달할 메시지도 변수 처리

        printString(msg, 3);
        printString(msg, 5);
        printString(msg, 7);
    }

    public static void printString(String msg, int rep) {
        for (int i = 0; i < rep; i++) {
            System.out.println(msg);
        }
        System.out.println();
    }
}
