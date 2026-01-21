package access.a;

public class AccessInnerMain {
    static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default 호출 가능
        // 같은 패키지이므로 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        // innerAccess 메서드 자체는 public 타입이므로 외부 호출 가능
        // 접근 제어자 = AccessData 클래스 내부
        // 모두 호출 가능
        data.innerAccess();
    }
}
