package pack;

// 패키지 전체 경로.클래스 import
import pack.a.User;
// pack.a 내 여러 개의 클래스를 쓸 때는 *로 import
// import pack.a.*;

public class PackageMain2 {
    Data data = new Data();

    // 패키지 전체 경로 생략 가능
    User user = new User();
}
