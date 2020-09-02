package arrayPractice;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		
		System.arraycopy(arr1, 0, arr2, 1, 3);
		/*파라미터 순서 : 복사해올 배열, 복사해올 배열의 어디서부터 복사해올지,
		*어느 배열에 붙여넣을지, 불여넣기 시작할 위치,복사를 몇 개 원소를 해올건지*/
		
		System.out.println(arr2); //이렇게하면 배열의 시작위치의 주소가 복사된다.
		System.out.println(arr2[i]);
	}
}
