package ref;

public class NullMain2 {
    static void main(String[] args) {
        Data data = null;

        data.value = 10; // NullPointerException
        System.out.println("data = " + data.value);
    }
}
