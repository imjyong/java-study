package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열 입력 (exit 입력 시 종료): ");
            String str = scanner.nextLine();

            if(str.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            else
                System.out.println("입력한 문자열: " + str);
        }
    }
}
