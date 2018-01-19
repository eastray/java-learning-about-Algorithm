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
		// System.out.println("n: " + n);
		// System.out.println("r: " + r);

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RedundantCombination comb = new RedundantCombination();

		comb.combination(4, 3, 3);
	}

}
