package operator;

public class Operator2 {
    static void main(String[] args) {
        // 문자열 + 문자열
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열 + 숫자
        String result3 = "a + b = " + 10; // 10을 문자열로 바꿈
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
