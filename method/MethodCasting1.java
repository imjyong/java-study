package method;

public class MethodCasting1 {
    static void main(String[] args) {
        double number = 1.5;
        printNumber((int) number); // 명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}