package static1;

public class DataMainCount3 {
    static void main(String[] args) {
        Data3 data1 = new Data3("A");
        // static 변수가 클래스 변수인 이유
        // data1.count가 아닌 Data3.count로 사용
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // static 변수를 인스턴스를 통해 접근
        // 인스턴스를 통해 접근하지만 실제로는 클래스 변수로 사용됨
        // 권장 X = 인스턴스 변수에 접근하는 것처럼 보일 수 있음
        System.out.println(data3.count); // 단순히 최신 값을 조회
        System.out.println(Data3.count); // 단순히 최신 값을 조회
    }
}
