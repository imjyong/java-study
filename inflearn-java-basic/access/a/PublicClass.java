package access.a;

/*
public 클래스는 반드시 파일명과 이름이 같아야 함
클래스 접근 제어자는 public, default만 사용 가능 (private, protected 사용 불가)
한 파일 내 여러 개의 default 클래스 생성 가능, public 클래스는 하나만 생성 가능
*/

public class PublicClass {
    static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// default 클래스는 같은 패키지 내에서 모두 사용 가능
class DefaultClass1 {

}

class DefaultClass2 {

}
