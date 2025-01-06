package ref.ex;

import java.util.Scanner;

public class ProductOrder3 {
    public static void main(String[] args) {

        //주문개수 스캐너로 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrder = new ProductOrder[n];

        for (int i = 0; i <productOrder.length; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();//입력 버퍼를 비우기 위한 코드

            productOrder[i]=creatOrder(productName,price,quantity);
        }

       printOrder(productOrder);
       int totalAmount = getTotalPrice(productOrder);
        System.out.println("총 결제 금액: "+totalAmount);
    }
        //creatOrder()를 여러번 사용해서 상품 주분 정보들을 생성하고 배열에 저장
        static ProductOrder creatOrder(String productName, int price,int quantity) {
        ProductOrder order  = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
        //printOrder()를 사용해서 상품 주문 정보 출력
        static void printOrder(ProductOrder[] ProductOrder) {
            for (ref.ex.ProductOrder order : ProductOrder) {
                System.out.println("상품명: " + order.productName + ", 가격: "+order.price + ", 수량: "+order.quantity);
            }
        }

        //getTotalAmount()를 사용해서 총 결제 금액 계산
        static int getTotalPrice(ProductOrder[] ProductOrder) {
        int totalPrice = 0;
            for (ref.ex.ProductOrder order : ProductOrder) {
                totalPrice+=order.price*order.quantity;
            }
        return totalPrice;
        }

}
