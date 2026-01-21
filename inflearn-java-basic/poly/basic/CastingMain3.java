package poly.basic;

// 업 캐스팅 vs 다운 캐스팅
public class CastingMain3 {
    static void main(String[] args) {
        Child child = new Child();
        // 업 캐스팅의 경우 생략 가능 (권장)
        // 부모 타입은 자식 타입을 담을 수 있으므로
        Parent parent1 = (Parent) child;
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
