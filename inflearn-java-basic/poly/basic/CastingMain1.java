package poly.basic;

public class CastingMain1 {
    static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 별도 처리 없이 자식의 기능 호출 불가
        // poly.childMethod();

        // 다운 캐스팅 (부모 타입 -> 자식 타입)
        // poly의 참조값 x001을 읽은 다음 자식 타입으로 지정
        Child child = (Child) poly;
        child.childMethod();
    }
}
