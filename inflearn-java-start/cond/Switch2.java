package cond;

public class Switch2 {
    static void main(String[] args) {
        int grade = 2;
        int coupon;

        // switch 문에는 조건식을 넣을 수 없음
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰: " + coupon);
    }
}
