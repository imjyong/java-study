package final1;

public class FieldInit {
    // static final 타입인 경우 변수명을 대문자로 작성 = 상수
    // 어차피 변경하지 못하므로 필드를 public으로 노출해서 사용 가능
    static final int CONST_VALUE = 10;
    final int value = 10;

    // 파이널 변수가 이미 초기화 된 경우 생성자에서 변경 불가
    /*
    public FieldInit(int value) {
        this.value = value;
    }
     */
}
