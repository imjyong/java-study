package oop1.ex;

public class Account {
    int balance = 0;

    // amount의 경우 외부 변수이므로 파라미터 설정 필요
    // 왜? 객체가 계속 기억할 필요가 없는 값이기 때문에 외부 변수로 설정
    int deposit(int amount) {
        balance += amount;

        return balance;
    }
    int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }

        return balance;
    }
}
