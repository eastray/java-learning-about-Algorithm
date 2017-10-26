package redundantPermutation;

public class RedundantPermutation {
	public static int[] result = new int[10];
	public static int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RedundantPermutation rePerm = new RedundantPermutation();
		
		rePerm.redundantPermutation(4, 3, 3);
		
	}

	public void redundantPermutation(int n, int r, int q) {

//		for (int i = 0; i < data.length; i++)
//			System.out.print(data[i]);
//		System.out.println();
//
//		System.out.println("n: " + n + ", r: " + r);

		if (r == 0) {
			process(q);
			return;
		}

		for (int i = n - 1; i >= 0; i--) {
			//System.out.println("i: " + i);
			swap(i, n - 1);

			result[r - 1] = data[n - 1];

			redundantPermutation(n, r - 1, q);

			System.out.println("i: " + i + ", n-1: " + (n-1));
			swap(i, n - 1);
		}

	}

	public void process(int q) {
		for (int i = q - 1; i >= 0; i--) {
			System.out.print(result[i]);
		}

		System.out.println();
	}

	public void swap(int i, int j) {

		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;

		System.out.println("data[i]: " + data[i]);
		System.out.println("data[j]: " + data[j]);
	}
}
