package pack.a;

public class User {
    // 다른 패키지에서 해당 생성자를 호출하기 위해 public 사용해야 함
    public User() {
        System.out.println("pack.a 패키지 내 생성자 User() 생성");
    }
}
