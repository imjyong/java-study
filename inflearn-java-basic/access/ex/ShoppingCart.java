package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
    private int totalPrice;

    // 이미 Item 클래스에서 만든 객체 item을 매개변수로 받는 거니까 또 생성자를 만든 후 배열에 넣을 필요는 없는 듯
    // 매개변수로 객체 받을 때 같은 타입인 Item item으로 받아야 함 = Item[] item (X)
    public void addItem(Item item) {
        // 10의 경우 items.length로 최적화 하는 것이 좋음
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            items[itemCount++] = item;
        }
    }
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            // 배열이 고정된 크기이기 때문에 for (Item item : items)와 같은 향상된 for문 사용 불가
            // EX. 아이템을 2개만 채우는 경우 나머지 요소가 모두 null이 됨
            // 아래 조건문의 경우 결국 null을 다 체크하기 때문에 일반 for문 + itemCount 조건을 리밋으로 사용하는 게 좋음
            if (item == null) {
                continue;
            }
            // 여기서 다른 클래스 Item에 있는 name, quantity 변수를 어떻게 인식하게 하지?
            // 호출하는 메서드를 public 타입으로 Item 클래스에서 만드는 거였다 = 두 변수 모두 private 이니까
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getPerTotalPrice());
            // 변수 totalPrice도 private int 메서드로 만들어 캡슐화하는 것이 좋음
            totalPrice += item.getPerTotalPrice();
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
