package method.ex;

public class MethodEx1 {
    static void main(String[] args) {
        System.out.println("평균값: " + avg(1, 2, 3));
        System.out.println("평균값: " + avg(15, 25, 35));
    }

    public static double avg(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double result = sum / 3.0;

        return result; // result 변수 안 만들고 바로 sum / 3.0 리턴해도 됨
    }
}
