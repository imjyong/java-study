package final1;

public class FinalFieldMain {
    static void main(String[] args) {
        System.out.println("생성자 초기화");
        // 생성자를 통해 값을 딱 한 번 세팅
        // 이후에는 값 변경 불가
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        System.out.println("필드 초기화");
        // 이미 초기값이 들어가있으므로 값을 바꿀 수 없음
        // 그러나 이 경우 여러 번 호출 시 힙 영역에 같은 값이 여러 개의 영역에 생성됨
        // 어차피 변경 못하니까 공유 메모리 static final로 생성하는 것이 좋음
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        System.out.println("상수");
        // 단 하나만 존재하는 변하지 않는 고정된 값
        System.out.println(FieldInit.CONST_VALUE);
    }
}
