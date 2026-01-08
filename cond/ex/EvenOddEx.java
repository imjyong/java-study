package cond.ex;

public class EvenOddEx {
    static void main(String[] args) {
        int x = 2;

        // 삼항 연산자를 사용하면 더 간단함
        if (x % 2 == 0)
            System.out.println("출력: x = " + x + ", 짝수");
        else
            System.out.println("출력: x = " + x + ", 홀수");
    }
}
