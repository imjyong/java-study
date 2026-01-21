package poly.practice.ex3;

public class PaymentService {
    public void pay(String type, int amount) {
        if (type.equals("CARD")) {
            System.out.println("카드 결제: " + amount);
        } else if (type.equals("CASH")) {
            System.out.println("현금 결제: " + amount);
        } else if (type.equals("POINT")) {
            System.out.println("포인트 결제: " + amount);
        }
    }
}
