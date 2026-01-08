package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int i = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            // i, sum 합산을 break 문 끝나고 하면 굳이 종료 조건 -1에 대해 추가 처리 할 필요 X
            sum += num;
            i += 1;
        }

        /*
        조건문을 다음과 같이 축약할 수 있음
        while ((num = scanner.nextInt()) != -1) {
            sum += num;
            i += 1;
        }
        */

        System.out.println("입력한 숫자들의 합계: " + sum);
        double avg = sum / i;
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
