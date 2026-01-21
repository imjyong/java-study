package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int productQuantity = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productArr = new ProductOrder[productQuantity];

        for (int i = 0; i < productQuantity; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productArr[i] = createOrder(productName, price, quantity); // 객체 생성 후 배열에 대입
        }

        printOrders(productArr);

        int totalAmount = getTotalAmount(productArr);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder (String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();

        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printOrders (ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount (ProductOrder[] orders) {
        int totalAmount = 0;

        for (ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }

        return totalAmount;
    }
}

