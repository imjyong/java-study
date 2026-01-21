package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    // 자기 자신의 데이터를 사용하기 때문에 외부 데이터를 받을 필요가 없음
    // 1. 파라미터 제거 2. 객체.메서드 에서 객체. 제거
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
