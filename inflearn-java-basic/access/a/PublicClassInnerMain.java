package access.a;

public class PublicClassInnerMain {
    static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 같은 패키지 이므로 default 클래스 호출 가능
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
