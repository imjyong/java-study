package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        double[] total = new double[4];
        // total, avg는 굳이 배열을 만들 필요가 없음

        // String subjects 배열을 만들면 더 편함
        for (int row = 0; row < arr.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int col = 0; col < arr[row].length; col++) {
                if (col == 0) {
                    System.out.print("국어 점수: ");
                    arr[row][col] = scanner.nextInt();
                    scanner.nextLine();
                } else if (col == 1) {
                    System.out.print("영어 점수: ");
                    arr[row][col] = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.print("수학 점수: ");
                    arr[row][col] = scanner.nextInt();
                    scanner.nextLine();
                }
                total[row] += arr[row][col];
            }
        }

        double[] avg = new double[4];
        for (int i = 0; i < total.length; i++) {
            avg[i] = total[i] / 3;
            System.out.println((i+ 1) + "학생의 총점: " + total[i] + ", 평균: " + avg[i]);
        }
    }
}
