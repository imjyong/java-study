package poly.basic;

public class PolyMain {
    static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        // 부모 타입은 자식, 손자 타입을 담을 수 있음
        System.out.println("Parent -> child");
        Parent poly = new Child();
        poly.parentMethod();

        /*
        자식의 기능은 호출할 수 없음
        호출자인 poly는 Parent 타입이므로 Parent 클래스부터 시작해서 필요한 기능을 찾음
        상속 관계는 부모 방향으로 찾아 올라갈 수는 있지만 자식 방향으로 찾아 내려갈 수 없음
        그러나 인스턴스에 childMethod()가 존재하기는 함 = casting 으로 호출 가능
        poly.childMethod();
         */

        // 자식 타입은 부모 타입을 담을 수 없음
        // Child child1 = new Parent();
    }
}
