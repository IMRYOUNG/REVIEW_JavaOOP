package classNobjectPractice;

public class ordered {

	public static void main(String[] args) {
		
		shoppingList shopping = new shoppingList();
		
		shopping.orderNum="201907210001";
		shopping.ID="abc123";
		shopping.orderDate="2019�� 7�� 21��";
		shopping.name="ȫ���";
		shopping.orderedProductNum="PD0345-12";
		shopping.add="����� �������� ���ǵ��� 20����";

		System.out.println("�ֹ��� ��ȣ : "+shopping.orderNum);
		System.out.println("�ֹ��� ��ȣ : "+shopping.ID);
		System.out.println("�ֹ��� ��ȣ : "+shopping.orderDate);
		System.out.println("�ֹ��� ��ȣ : "+shopping.name);
		System.out.println("�ֹ��� ��ȣ : "+shopping.orderedProductNum);
		System.out.println("�ֹ��� ��ȣ : "+shopping.add);
	
	}

}
