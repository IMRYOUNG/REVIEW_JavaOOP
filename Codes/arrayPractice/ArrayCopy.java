package arrayPractice;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		
		System.arraycopy(arr1, 0, arr2, 1, 3);
		/*�Ķ���� ���� : �����ؿ� �迭, �����ؿ� �迭�� ��𼭺��� �����ؿ���,
		*��� �迭�� �ٿ�������, �ҿ��ֱ� ������ ��ġ,���縦 �� �� ���Ҹ� �ؿð���*/
		
		System.out.println(arr2); //�̷����ϸ� �迭�� ������ġ�� �ּҰ� ����ȴ�.
		System.out.println(arr2[i]);
	}
}
