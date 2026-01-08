package operator;

public class Logical2 {
    static void main(String[] args) {
        int a = 15;

        // a is bigger than 10, and less than 20
        boolean result = a > 10 && a < 20;
        System.out.println("result = " + result);
    }
}
