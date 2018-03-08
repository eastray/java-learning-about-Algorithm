package redundantCombination;

public class RedundantCombination {

	public static int[] result = new int[10];
	public static int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	private void process(int q) {
		for (int i = q - 1; i >= 0; i--)
			System.out.print(result[i]);

		System.out.println();
	}

	private void combination(int n, int r, int q) {
		if (r == 0) {
			process(q);
			return;
		} else if (n == 0)
			return;
		else {
			result[r - 1] = data[n - 1];
			combination(n, r - 1, q);
			combination(n - 1, r, q);
		}

	}

	private void printArray(int[] arr, int index) {
		for (int i = 0; i < index; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private void redundantCombination(int[] array, int index, int n, int r, int target) {

		if (r == 0)
			printArray(array, index);

		else if (n == target)
			return;

		else {
			array[index] = target;
			combination(array, index + 1, n, r - 1, target);
			combination(array, index, n, r, target + 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RedundantCombination comb = new RedundantCombination();

		comb.combination(4, 3, 3);

		System.out.println();
		int[] array = new int[5];
		System.out.println("Redundant Combination");
		comb.redundantCombination(array, 0, 5, 2, 0);
	}

}
