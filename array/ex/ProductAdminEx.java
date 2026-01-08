package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 크기를 나중에 입력 받는 경우, 최대 개수로 먼저 배열을 생성
        // 이후 ArrayList로 배열 크기를 유연하게 저장할 수 있는 방법을 배울 예정
        int maxProducts = 10;
        String[] productNames = new String[maxProducts]; // 상품 이름
        int[] productPrices = new int[maxProducts]; // 상품 가격
        int productCount = 0; // 현재 등록된 상품 개수

        int option;
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }
                else {
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();
                    scanner.nextLine();
                    productCount++;
                }
            }
            else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }
                else {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                }
            }
            else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
