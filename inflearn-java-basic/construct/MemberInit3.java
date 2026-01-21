package construct;

public class MemberInit3 {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        // this 없으면 메서드 파라미터 name인지 데이터 필드의 name인지 구분 못 함
        // 메서드 내에서 멤버 변수에 접근하기 위해 this 사용
        // 주로 이름이 중복될 때 this 사용
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
