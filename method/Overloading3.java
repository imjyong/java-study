package method;

public class Overloading3 {
    static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    /*
    지워도 둘 다 호출 가능 (자동 형변환)
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    */

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}