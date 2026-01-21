package poly.practice.ex4;

public class Main {
    static void main(String[] args) {
        Payment payment;

        // 인터페이스에서 객체 생성이 안된다는 뜻 = new Payment(); 불가
        // 참조 변수 선언은 가능함 = Payment payment
        payment = new CardPayment();
        payment.pay(1000);

        payment = new CashPayment();
        payment.pay(300);

        payment = new PointPayment();
        payment.pay(500);
    }
}
