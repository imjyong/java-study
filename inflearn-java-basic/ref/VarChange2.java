package ref;

public class VarChange2 {
    static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조 값 = " + dataA);
        System.out.println("dataB 참조 값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        System.out.println();

        // dataA 변경
        dataA.value = 20;
        System.out.println("dataA.value = 20 으로 변경");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        System.out.println();

        // dataB 변경
        dataB.value = 30;
        System.out.println("dataB.value = 30 으로 변경");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
