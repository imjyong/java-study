package cond;

public class If4 {
    static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        }
        // 이미 앞에서 7보다 작지 않다고 false 인지 후 넘어옴
        else if (age <= 13) {
            System.out.println("초등학생");
        }
        else if (age <= 16) {
            System.out.println("중학생");
        }
        else if (age <= 19) {
            System.out.println("고등학생");
        }
        else {
            System.out.println("성인");
        }
    }
}
