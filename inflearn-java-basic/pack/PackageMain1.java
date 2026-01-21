package pack;

public class PackageMain1 {
    static void main(String[] args) {
        // 동일 패키지 내 생성자 호출
        // 패키지 경로 생략 가능
        Data data = new Data();

        // 다른 패키지 내 생성자 호출
        // 패키지 전체 경로를 앞에 붙여줘야함
        pack.a.User user = new pack.a.User();
    }
}
