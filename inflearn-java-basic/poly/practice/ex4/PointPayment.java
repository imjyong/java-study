package poly.practice.ex4;

public class PointPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("포인트 결제: " + amount);
    }
}
