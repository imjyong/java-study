package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("swap 전 a: " + a + " b: " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("swap 후 a: " + a + " b: " + b);
    }
}
