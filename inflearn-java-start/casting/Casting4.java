package casting;

public class Casting4 {
    static void main(String[] args) {
        int div1 = 3 / 2; // int / int
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2; // int / int = int
        System.out.println("div2 = " + div2); // (double) 1.0

        double div3 = 3.0 / 2; // double / (double) int
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2; // (double) int / (double) int
        System.out.println("div4 = " + div4); // 1.5
    }
}
