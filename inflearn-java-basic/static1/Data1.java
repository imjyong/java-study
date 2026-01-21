package static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        // 누적 생성 개수를 세는 변수
        // 현재 count는 객체마다 따로 존재하는 인스턴스 변수 = 계속 1만 출력
        // 객체 3개 = count 3개
        count++;
    }
}
