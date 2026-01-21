package class1;

public class ClassStart2 {
    static void main(String[] args) {
        // 현재 한 학생의 데이터가 배열 3개에 나눠져있음 = 삽입 및 삭제가 비효율적
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
