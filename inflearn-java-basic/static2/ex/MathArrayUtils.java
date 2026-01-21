package static2.ex;

public class MathArrayUtils {
    // static 메서드에서 인스턴스 변수 호출 불가
    private static int sum;
    private static double avg;
    private static int min;
    private static int max;

    public static int sum(int[] array) {
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    public static double average(int[] array) {
        sum = sum(array);
        avg = (double)sum / array.length;

        return avg;
    }
    public static int min(int[] array) {
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }
    public static int max(int[] array) {
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

}
