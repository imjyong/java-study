package access.b;

// import access.a.DefaultClass1;
// import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 다른 패키지 이므로 default 클래스 호출 불가
        // DefaultClass1 class1 = new DefaultClass1();
        // DefaultClass2 class2 = new DefaultClass2();
    }
}
