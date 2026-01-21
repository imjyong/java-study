package static2;

// 패키지명.클래스명.정적 메서드명
// static2.DecoData.* 할 시 DecoData 클래스 내 모든 정적 변수, 메서드 호출 시 클래스명 생략 가능
import static static2.DecoData.staticCall;

public class DecoDataMain {
    // 메인 메서드는 static 이기 때문에 객체 생성 없이 바로 실행 가능
    // 메인 메서드가 있는 클래스에서 메서드 생성 시 static으로 생성해야 함 = 정적 메서드는 정적 메서드만 호출 가능하므로
    // 물론 객체 생성 후 메서드 호출하면 인스턴스도 가능
    static void main(String[] args) {
        System.out.println("1. 정적 호출");
        // alt + Enter로 정적 메서드 import
        // 클래스명 생략하여 정적 호출 가능
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. 정적 내에서 인스턴스 호출");
        staticCall(data1);

        // 인스턴스를 통한 접근
        // 실제로는 클래스 접근
        DecoData data3 = new DecoData();
        staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}
