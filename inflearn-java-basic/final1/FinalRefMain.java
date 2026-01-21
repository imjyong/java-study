package final1;

public class FinalRefMain {
    static void main(String[] args) {
        // 참조형 변수 data를 final로 선언
        // 참조 대상 변경 불가
        final Data data = new Data();

        // 참조 대상의 값은 변경 가능
        // value 변수는 final 변수가 아니므로
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
