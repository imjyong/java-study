package poly.basic;

public class CastingMain5 {
    static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    // 다운 캐스팅 수행 전 instanceof를 사용해서 가능 여부를 확인한 후 수행해야 안전
    // instanceof 기준으로 왼쪽 타입이 오른쪽 타입에 들어갈 수 있는지 대입해보면 됨
    // Child instanceof Parent = true
    // Parent instanceof Child = false
    private static void call(Parent parent) {
        // parent가 Child로부터 생성된 인스턴스라면
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 O");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 X");
        }
    }
}
