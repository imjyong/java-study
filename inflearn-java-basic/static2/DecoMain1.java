package static2;

public class DecoMain1 {
    static void main(String[] args) {
        String s = "hello java";

        // 큰 의미가 없는 객체 생성
        // deco() 기능은 인스턴스 변수도 없고, 단순히 기능만 제공
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
