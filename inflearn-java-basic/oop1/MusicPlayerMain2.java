package oop1;

public class MusicPlayerMain2 {
    static void main(String[] args) {
        // 객체 지향 프로그래밍
        // 음악 플레이어와 관련된 변수들은 분리
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 ON
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 UP
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        // 볼륨 DOWN
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 OFF
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}