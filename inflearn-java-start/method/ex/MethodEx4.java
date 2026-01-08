package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option, depositAmount, withdrawAmount;
        int balance = 0;

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택: ");
            option = scanner.nextInt();
            scanner.nextLine();

            // switch 문으로 작성할 경우 더 간단함
            if (option == 1) {
                System.out.print("입금액을 입력하세요: ");
                depositAmount = scanner.nextInt();
                scanner.nextLine();
                balance = deposit(balance, depositAmount);
            }
            else if (option == 2) {
                System.out.print("출금액을 입력하세요: ");
                withdrawAmount = scanner.nextInt();
                scanner.nextLine();
                balance = withdraw(balance, withdrawAmount);
            }
            else if (option == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            }
            else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);

        return balance;
    }
    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
