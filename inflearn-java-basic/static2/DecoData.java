package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static 메서드는 static 변수, static 메서드에 접근 가능
    // 클래스 명으로 접근
    public static void staticCall() {
        staticValue++; // = DecoData.staticValue
        staticMethod(); // = DecoData.staticMethod()

        // 인스턴스 변수, 인스턴스 메서드는 접근 불가
        // 인스턴스는 생성이 된 후 참조값으로 접근
        // instanceValue++;
        // instanceMethod();
    }
    public static void staticCall(DecoData data) {
        // 외부에서 참조값을 받으면 staic 메서드 내에서 인스턴스 호출 가능
        data.instanceValue++;
        data.instanceMethod();
    }
    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

}
