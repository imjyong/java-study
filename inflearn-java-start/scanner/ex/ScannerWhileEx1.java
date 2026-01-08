package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine(); // 엔터까지 포함해서 한 줄을 통째로 읽음

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 엔터를 처리하지 않는 nextInt 특성을 고려하여 다음 입력을 위해 별도 처리

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
