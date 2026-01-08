package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("두 숫자 모두 0 입력 시 종료");

            System.out.print("첫 번째 숫자 입력: ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자 입력: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            else
                System.out.println("두 숫자의 합: " + sum);
        }
    }
}
