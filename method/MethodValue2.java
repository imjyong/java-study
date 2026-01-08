package method;

public class MethodValue2 {
    static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1= changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    // 위 number와 별개의 변수
    public static int changeNumber(int num2) {
        num2 *= 2;

        return num2;
    }
}
