package array;

public class Array1Ref1 {
    static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열 생성
        // int[] students = new int[]{90, 80, 70, 60, 50};

        /*
        int[] students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        */

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
