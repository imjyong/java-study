package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[num];
        System.out.println(num + "개의 정수를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            scanner.nextLine();
            total += arr[i];
        }

        System.out.println("입력한 정수의 합계: " + total);

        double avg = (double) total / arr.length;
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
