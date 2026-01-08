package loop.ex;

public class WhileEx2 {
    static void main(String[] args) {
        int num = 0;
        int i = 0;

        while (true) {
            num += 2;
            System.out.println(num);
            i++;

            if (i == 10)
                break;
        }
    }
}
