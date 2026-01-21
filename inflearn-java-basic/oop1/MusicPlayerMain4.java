package oop1;

public class MusicPlayerMain4 {
    static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // 메서드까지 모두 캡슐화했기 때문에 데이터를 정의하는 클래스에서 변동이 생겨도
        // 데이터를 갖다 쓰는 클래스 (= 클라이언트 코드)에서는 코드 변경이 일어나지 않음
        // 객체 지향 프로그래밍에서는 객체(EX. 뮤직 플레이어)를 어떻게 잘 설계하느냐가 중요함

        // 음악 플레이어 ON
        musicPlayer.on();

        // 볼륨 UP
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        // 볼륨 DOWN
        musicPlayer.volumeDown();

        // 음악 플레이어 상태
        musicPlayer.showStatus();

        // 음악 플레이어 OFF
        musicPlayer.off();
    }
}