package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); // 오버라이드 필요
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
