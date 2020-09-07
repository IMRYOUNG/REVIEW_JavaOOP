package interface_Myself2;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending 입니다.");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending 입니다.");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}

}
