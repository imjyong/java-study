package memory;

public class JavaMemoryMain2 {
    static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main start");
    }

    static void method1() {
        System.out.println("method1 start");
        // new 키워드로 생성된 객체는 힙 영역에 저장됨
        // Data data1 = x001
        Data data1 = new Data(10);
        // method2(x001)
        method2(data1);
        System.out.println("method1 end");
        // 이후 x001은 GC(garbage collection) 대상
    }

    static void method2(Data data1) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data1.getValue());
        System.out.println("method2 end");
    }
}
