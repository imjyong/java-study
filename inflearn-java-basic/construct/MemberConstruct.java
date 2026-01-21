package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 생성자 이름은 클래스 이름과 같아야 함
    // 생성자는 반환 타입이 없음
    // 나머지는 메서드와 동일
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    // 생성자 추가
    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
        // 중복 코드 제외하여 더 간단하게 호출
        // 파라미터 name, age 값을 가지고 매개변수 3개 생성자를 호출
        // this()는 반드시 첫 번째 문장에서 호출해야 함
        this(name, age, 50);

        /*
        // 이름과 나이만 있으면 성적은 50점
        this.name = name;
        this.age = age;
        this.grade = 50;
        */
    }
}
