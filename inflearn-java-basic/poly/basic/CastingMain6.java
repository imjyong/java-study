package poly.basic;

public class CastingMain6 {
    static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        // instanceof 사용하면서 동시에 변수 선언 가능
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 O");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 X");
        }
    }
}
