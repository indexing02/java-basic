package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder[] productOrder = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName="두부";
        productOrder1.price=2000;
        productOrder1.quantity=2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName="김치";
        productOrder2.price=5000;
        productOrder2.quantity=1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName="콜라";
        productOrder3.price=1500;
        productOrder3.quantity=2;

        productOrder[0]=productOrder1;
        productOrder[1]=productOrder2;
        productOrder[2]=productOrder3;

        int totalAmount = 0;

        for (ProductOrder order : productOrder) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.quantity + ", 수량: " + order.price);
            totalAmount += order.price*order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
