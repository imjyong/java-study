package oop1;

public class ValueData {
    // 데이터 (= 필드)
    int value;

    // 데이터 클래스에 메서드도 함께 생성
    // 메서드는 객체를 생성해야 호출 가능
    // static은 객체를 생성하지 않고도 메서드 호출 가능
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
