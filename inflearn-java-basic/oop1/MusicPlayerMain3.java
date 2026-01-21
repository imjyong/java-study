package oop1;

public class MusicPlayerMain3 {
    static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 ON
        on(data);

        // 볼륨 UP
        volumeUp(data);
        volumeUp(data);
        // 볼륨 DOWN
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 OFF
        off(data);
    }

    // 메서드 추출
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
