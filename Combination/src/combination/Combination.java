package combination;

public class Combination {

	private void printArray(int[] arr, int index) {
		for (int i = 0; i < index; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private void combination(int[] array, int index, int n, int r, int target) {

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

		Combination comb = new Combination();
		int[] array = new int[5];

		System.out.println("Combination");
		comb.combination(array, 0, 5, 3, 0);

		System.out.println();
		System.out.println("Redundant Combination");
		comb.redundantCombination(array, 0, 5, 2, 0);
	}

}
