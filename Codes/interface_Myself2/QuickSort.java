package interface_Myself2;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending �Դϴ�.");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending �Դϴ�.");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort�Դϴ�.");
	}

}
