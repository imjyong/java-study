package extends1.super2;

public class Super2Main {
    static void main(String[] args) {
        // 호출은 자식부터 되나, 초기화는 최상위 부모부터 실행되면서 계층적으로 내려옴
        ClassC classC = new ClassC();
        // ClassB classB = new ClassB(100);
    }
}
