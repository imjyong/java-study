package static1;

public class DataCountMain2 {
    static void main(String[] args) {
        // 변수 = data1, data2
        // 객체 = Data2, Counter
        Counter counter = new Counter();

        // counter 인스턴스 공용 사용
        // 만약 매개변수로 넘기는 counter 이름이 다르다면 모두 다른 변수 취급
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
