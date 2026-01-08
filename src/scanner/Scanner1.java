package scanner;

import java.util.Scanner;

public class Scanner1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = scanner.nextLine(); // 입력을 str 변수에 대입
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수 입력: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수 입력: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}