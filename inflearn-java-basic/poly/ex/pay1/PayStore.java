package poly.ex.pay1;

// 추상 클래스 = 인스턴스 생성 불가
public abstract class PayStore {
    // 리턴 타입 = Pay
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
