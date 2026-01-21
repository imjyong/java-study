package poly.basic;

// 자바가 다운 캐스팅을 자동으로 지원하지 않는 이유
public class CastingMain4 {
    static void main(String[] args) {
        // 부모, 자식 인스턴스 둘 다 존재
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 문제 없음
        child1.childMethod();

        // 부모 인스턴스만 존재
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        // child2.childMethod(); // 실행 불가, ClassCastException
    }
}
