package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("정수 입력 (0 입력 시 종료): ");
            int num = scanner.nextInt();

            sum += num;
            if (num == 0) {
                System.out.println("입력한 모든 정수의 합: " + sum);
                break;
            }
        }
    }
}
