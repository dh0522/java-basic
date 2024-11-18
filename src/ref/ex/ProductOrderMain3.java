package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 주문의 개수를 입력하세요: ");


		int count = sc.nextInt();
		ProductOrder[] orders = new ProductOrder[count];


		for( int i =0 ; i < count; i++ ){
			System.out.println(i+1+"번째 주문 정보를 입력하세요. ");

			System.out.print("상품명: ");
			String name = sc.next();

			System.out.print("가격: ");
			int price = sc.nextInt();

			System.out.print("수량: ");
			int quantity = sc.nextInt();
			sc.nextLine(); // 입력 버퍼를 비우기 위한 코드
			orders[i] = createOrder( name , price , quantity );
		}

		printOrders(orders);
		System.out.println("총 결제 금액: "+ getTotalAmount(orders) );

	}
	private static ProductOrder createOrder( String productName , int price , int quantity) {

		ProductOrder product = new ProductOrder();
		product.productName = productName;
		product.price = price;
		product.quantity = quantity;

		return product;
	}
	private static void printOrders( ProductOrder[] orders ){

		for (ProductOrder order : orders) {
			System.out.println("상품명: " + order.productName +", 가격: "+ order.price +", 수량: "+ order.quantity );
		}
	}
	private static int getTotalAmount( ProductOrder[] orders ){
		int sum = 0;
		for (ProductOrder order : orders) {
			sum += order.price * order.quantity;
		}
		return sum;
	}
}
