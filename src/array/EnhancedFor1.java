package array;

public class EnhancedFor1 {
    static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문
        // 인덱스 값이 필요할 때는 쓸 수 없음, int i 선언하여 사용 가능하지만 메모리 고려하면 for문 쓰는 것이 더 적합
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
