package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println(num + "개의 정수를 입력하세요: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
