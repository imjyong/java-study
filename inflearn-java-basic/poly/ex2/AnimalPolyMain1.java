package poly.ex2;

public class AnimalPolyMain1 {
    static void main(String[] args) {
        // Animal dog = new Dog(); 과 같음, 이때는 부모 타입 = 자식 타입
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // animal은 dog, cat, cow의 부모, 즉 자식 타입을 담을 수 있음
    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        // 오버라이딩 메서드는 우선권을 가짐
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
