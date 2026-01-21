package poly.basic;

public class CastingMain2 {
    static void main(String[] args) {
        Parent poly = new Child();

        // 일시적 다운 캐스팅: 해당 메서드를 호출하는 순간만 다운 캐스팅
        // . 연산자의 우선순위가 더 높으므로 이중괄호 필요
        ((Child) poly).childMethod();
    }
}
