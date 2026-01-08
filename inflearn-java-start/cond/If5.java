package cond;

public class If5 {
    static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // 별개 조건문이므로 둘 다 할인 받을 수 있음
        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인");
        }
        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이, 1,000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
