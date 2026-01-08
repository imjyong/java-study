package operator;

public class Comp2 {
    static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        // 문자열 비교 시 == 이 아니라 .equals()를 사용해야 함
        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);

        System.out.println(result1); // true
        System.out.println(result2); // true
        System.out.println(result3); // false
    }
}
