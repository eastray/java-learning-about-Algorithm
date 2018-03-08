package permutation;

public class Permutation {

	private void print(int[] arr, int k) {
		for (int i = 0; i < k; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}

	private int[] swap(int[] arr, int i, int depth) {
		int temp = arr[i];
		arr[i] = arr[depth];
		arr[depth] = temp;

		return arr;

	}

	private void perm(int[] arr, int depth, int n, int k) {

		if (depth == k) {
			print(arr, k);
			return;

		}

		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, k);
			swap(arr, i, depth);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Permutation perm = new Permutation();

		perm.permute("ABCD");

		perm.perm(new int[] { 1, 2, 3, 4 }, 0, 4, 3);

	}

	private void permute(String full) {
		if (full == null || full.length() == 0) {
			System.out.println("You must provide a string of length > 0.");
			return;

		}

		permute("", full);

	}

	private void permute(String prefix, String remainder) {

		if (remainder.length() == 0) {
			System.out.println(prefix);
			return;

		}

		for (int i = 0; i < remainder.length(); i++) {
			permute(prefix + remainder.charAt(i),
					remainder.substring(0, i) + remainder.substring(i + 1, remainder.length()));

		}
	}

}
