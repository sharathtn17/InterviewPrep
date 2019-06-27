package Interview;

public class QuickSort {

	public static void main(String args[]) {
		//int[] arr = { 8, 2, 1, 5, 69, 10, 3 };
		int[] arr = { 8, 2, 1, 5, 69, 10, 3,-1,-4,2,200,-44 };
		quicsort(0, arr.length - 1, arr);
		// int pivotele=getpartionIndex(0,arr.length-1,arr);
		// System.out.println(pivotele);

		for (int a : arr) {
			System.out.print(a + ",");
		}

	}

	public static int getpartionIndex(int l, int h, int[] arr) {
		int i = l + 1;
		int j = h;
		int pivot = arr[l];
	//	for(int a:arr) System.out.print(a + ",");
		while (i < j) {
			while (arr[i] <= pivot && i < h) {
				i++;
			}

			while (arr[j] >= pivot && j > l) {
				j--;
			}

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		if (i != j) {
			int temp = arr[j];
			arr[j] = arr[l];
			arr[l] = temp;
		}

		return j;
	}
	static int pivotele ;
	public static void quicsort(int l, int h, int[] arr) {
		if (l < h ) {

		    pivotele = getpartionIndex(l, h, arr);
			System.out.println(pivotele);
			System.out.println("low "+l+" High "+h);
			quicsort(l, pivotele-1, arr);
			
			quicsort(pivotele+1,h, arr);
		}
	}

}
