package loop;

public class While1_3 {
    static void main(String[] args) {
        int sum = 0;
        int i = 50;
        int endNum = 100;

        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
            i++;
        }
    }
}
