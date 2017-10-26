package permutation;

public class Permutation {

	public static int[] result = new int[10];
	public static int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public void swap(int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	public void process(int q) {
		for (int i = q - 1; i >= 0; i--)
			System.out.print(result[i]);

		System.out.println();
	}

	public void permutation(int n, int r, int q) {

		if (r == 0) {
			process(q);
			return;
		}

		for (int i = n - 1; i >= 0; i--) {
			swap(i, n - 1);
			
			result[r - 1] = data[n - 1];
			
			permutation(n - 1, r - 1, q);
			swap(i, n - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Permutation perm = new Permutation();

		perm.permutation(4, 3, 3);

	}
}
