package construct;

public class ConstructMain1 {
    static void main(String[] args) {
        // 객체 생성과 동시에 생성자 호출 가능
        // 생성자 사용 시 필수 값 입력을 보장할 수 있음
        // 이전에는 필수 값 입력 안하면 null, 0, 0 으로 유령 데이터가 만들어짐
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
