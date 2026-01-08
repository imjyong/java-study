package scanner;

import java.util.Scanner;

public class Scanner3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = scanner.nextInt();

        if (num1 > num2)
            System.out.print("더 큰 숫자는 num1 입니다. " + num1);
        else if (num1 < num2)
            System.out.print("더 큰 숫자는 num2 입니다. " + num2);
        else
            System.out.print("두 숫자는 같습니다. num1: " + num1 + ", num2: " + num2);
    }
}
