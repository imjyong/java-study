package ref.ex;

public class ProductOrderMain {
    static void main(String[] args) {
        ProductOrder product1 = createOrder("두부", 2000, 2);
        ProductOrder product2 = createOrder("김치", 5000, 1);
        ProductOrder product3 = createOrder("콜라", 1500, 2);

        ProductOrder[] productArr = {product1, product2, product3};
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

