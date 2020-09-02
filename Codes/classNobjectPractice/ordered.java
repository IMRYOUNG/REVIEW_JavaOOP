package classNobjectPractice;

public class ordered {

	public static void main(String[] args) {
		
		shoppingList shopping = new shoppingList();
		
		shopping.orderNum="201907210001";
		shopping.ID="abc123";
		shopping.orderDate="2019년 7월 21일";
		shopping.name="홍길순";
		shopping.orderedProductNum="PD0345-12";
		shopping.add="서울시 영등포구 여의도동 20번지";

		System.out.println("주문자 번호 : "+shopping.orderNum);
		System.out.println("주문자 번호 : "+shopping.ID);
		System.out.println("주문자 번호 : "+shopping.orderDate);
		System.out.println("주문자 번호 : "+shopping.name);
		System.out.println("주문자 번호 : "+shopping.orderedProductNum);
		System.out.println("주문자 번호 : "+shopping.add);
	
	}

}
