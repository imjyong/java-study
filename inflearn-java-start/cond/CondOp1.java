package cond;

public class CondOp1 {
    static void main(String[] args) {
        int age = 18;

        // 삼항 연산자로 if 문을 더욱 간단하게 쓸 수 있음
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " status = " + status);
    }
}