package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {
    // 실제로 주문하는 비즈니스 로직
    public void order() {
        User user = new User();
        Product product = new Product();
        // 회원이 상품을 주문 = 실제 DB에 저장
        Order order = new Order(user, product);
    }
}
