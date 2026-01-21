package final1;

public class ConstantMain1 {
    static void main(String[] args) {
        // 현재 1000 = 고정된 값
        // 최대 참여자 수 변경 시 바꿔야 할 코드가 많음
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
