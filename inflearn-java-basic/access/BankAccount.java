package access;

public class BankAccount {
    // 데이터 필드는 외부에 직접 노출하지 않음
    // BankAccount가 제공하는 메서드를 통해서만 접근 가능하도록 설정
    // public으로 설정할 경우 모든 검증과 캡슐화가 깨져버리고, 여러 개발자가 개발할 시 버그 발생 가능
    // 캡슐화 = 데이터 보호, 개발 복잡도 완화
    private int balance;

    // 생략 가능
    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    // 입력 금액 검증
    // 내부에서만 사용하는 메서드 이므로 접근 제어자를 private 으로 설정
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 함
        return amount > 0;
    }
}
