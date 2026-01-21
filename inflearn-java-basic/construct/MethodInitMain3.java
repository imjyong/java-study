package construct;

public class MethodInitMain3 {
    static void main(String[] args) {
        MemberInit3 member1 = new MemberInit3();
        member1.initMember("user1", 15, 90);

        MemberInit3 member2 = new MemberInit3();
        member2.initMember("user1", 15, 90);;

        MemberInit3[] members = {member1, member2};

        for (MemberInit3 member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
