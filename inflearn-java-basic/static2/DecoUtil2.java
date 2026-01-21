package static2;

public class DecoUtil2 {
    // 정적 메서드, 클래스 메서드 생성
    // 인스턴스 생성 없이 클래스 명을 통해 바로 호출 가능
    // 인스턴스 변수 필요 없이 단순히 로직만 있는 메서드 사용 시 클래스 메서드 사용
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
