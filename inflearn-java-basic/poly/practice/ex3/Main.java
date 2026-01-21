package poly.practice.ex3;

public class Main {
    static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.pay("CARD", 1000);
        paymentService.pay("CASH", 500);
        paymentService.pay("POINT", 300);
    }
}
