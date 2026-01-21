package static1;

public class Data2 {
    public String name;

    // Counter 클래스 변수를 매개변수로 받으면 Data2 클래스에서 사용 가능
    // Data2 클래스 내에서 counter 필드를 두고, static 없이 누적은 불가능
    public Data2 (String name, Counter counter) {
        this.name = name;
        // 서로 다른 Data2 객체가 같은 Counter 객체 공유
        // 객체 3개 = counter 1개
        counter.count++;
    }
}