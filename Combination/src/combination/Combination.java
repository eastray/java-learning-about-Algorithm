package combination;

import java.util.ArrayList;

public class Combination {

	public static void main(String[] args) {

		Combination comb = new Combination();
		sdoCombination(a, 5, 3, 0);
	}

	private ArrayList<String> list = new ArrayList<String>();

	public void printArray() {
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		System.out.println("");
	}

	public void doCombination(String[] str, int n, int r, int index) {

		if (r == 0) {
			printArray();
			return;

		} else if (n == r) {
			for (int i = 0; i < n; i++)
				list.add(str[index + i]);

			printArray();

			list.clear();

		} else {
			list.add(str[index]);
			doCombination(str, n - 1, r - 1, index + 1);

			if (list.size() != 0)
				list.remove(list.size() - 1);

			doCombination(str, n - 1, r, index + 1);

		}
	}

	private void printArr(int[] arr, int index) {
		for (int i = 0; i < index; i++)
			System.out.print(arr[i] + " ");

		System.out.println();

	}

	private void combination(int[] arr, int index, int n, int r, int target) {
		if (r == 0)
			printArr(arr, index);

		else if (target == n)
			return;

		else {
			arr[index] = target;
			combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
		}
	}

}
