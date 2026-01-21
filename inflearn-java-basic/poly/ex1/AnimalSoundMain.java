package poly.ex1;

public class AnimalSoundMain {
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 현재 dog, cat, cow는 서로 다른 클래스
        // 메서드, 배열로 코드 중복 제거 불가능
        // 다형적 참조로 메서드 오버라이딩 시 모두 같은 타입을 사용할 수 있어 메서드, 배열을 활용하여 코드 중복 제거 가능
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCow(cow);
    }

    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
