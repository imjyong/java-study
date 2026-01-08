package cond;

public class If1 {
    static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("성인입니다.");
        }
        // 위 if 문과 별개로 한 번 더 조건 검사
        // 만약 조건이 중복되면 두 개 다 출력하게 됨
        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
