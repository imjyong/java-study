package access;

public class SpeakerMain {
    static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 스피커 객체를 사용하는 사용자는 스피커의 볼륨 필드와 메서드에 모두 접근 가능
        // 볼륨 100 이상 못 올라가게 해놔도 밖에서 수정하면 소용이 없어짐
        // 볼륨 필드의 외부 접근 막는 방법이 필요함 = 접근 제어자 필요
        System.out.println("volume 필드 직접 접근하여 수정");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
