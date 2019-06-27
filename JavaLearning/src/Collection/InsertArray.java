package Collection;

public class InsertArray {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
		}

		int[] b = new int[a.length + 1];
		int k = 10;
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			if (i == 2) {
				b[i] = k;
			} else {
				b[i] = a[j];
				j++;
			}
		}
		for (int k1 = 0; k1 < b.length; k1++) {
			System.err.println(b[k1]);
		}
	}
}
