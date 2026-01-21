package poly.ex.sender;

public interface Sender {
    // 왜 인터페이스 내 메서드는 매개변수 안된다고 생각했었지? 가능함
    // 바디만 생성이 안될 뿐 정의는 가능하므로 매개변수, 반환형 지정 가능
    void sendMessage(String msg);
}
