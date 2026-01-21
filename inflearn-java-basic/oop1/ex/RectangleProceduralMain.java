package oop1.ex;

public class RectangleProceduralMain {
    static void main(String[] args) {
        RectangleProcedural object = new RectangleProcedural();

        object.width = 5;
        object.height = 8;

        // 파라미터 필요 없음
        int area = object.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = object.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = object.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
