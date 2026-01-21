package poly.overriding;

public class OverridingMain {
    static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); // poly는 Parent 타입이고, 현재 인스턴스에는 Parent, Child 존재
        System.out.println("Parent -> Child");
        // 변수는 오버라이딩 X
        System.out.println("value = " + poly.value);
        // 메서드는 오버라이딩 O
        // 인스턴스 내에서 오버라이딩 된 메서드는 항상 우선권을 가짐
        // 더 하위 자식의 오버라이딩 메서드가 더 높은 우선순위
        poly.method();
    }
}
