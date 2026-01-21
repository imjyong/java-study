package poly.ex6;

// 상속은 단일 상속, 구현은 다중 구현이 가능하므로 extends가 먼저 나와야 함
public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("쨱짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
