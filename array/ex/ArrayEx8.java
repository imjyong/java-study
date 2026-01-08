package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"국어", "영어", "수학"};

        System.out.print("학생 수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int[][] arr = new int[num][subjects.length]; // num, subjects 할당 후 해당 크기로 점수 배열 선언

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                arr[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        int total = 0;
        double avg = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < subjects.length; j++) {
                total += arr[i][j];
            }
            avg = (double) total / num;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);
            total = 0; // 점수 초기화
            avg = 0; // 평균 초기화
        }
    }
}
