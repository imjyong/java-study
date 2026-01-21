package poly.ex5;

// 인터페이스 상속 시 extends가 아닌 implements 사용
public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
