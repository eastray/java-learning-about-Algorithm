package dfs;

public class ShortestPath {
	static int[][] matrix = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0 },
			{ 1, 1, 1, 1, 1 } };
	static int n = 5;
	static int min = n * n;

	private void dfs(int x, int y, int l) {

		if (x == n - 1 && y == n - 1) {
			if (min > l)
				min = l;

			return;
		}
		matrix[y][x] = 0;

		if (y > 0 && matrix[y - 1][x] != 0)
			dfs(x, y - 1, l + 1);

		if (y < n - 1 && matrix[y + 1][x] != 0)
			dfs(x, y + 1, l + 1);

		if (x > 0 && matrix[y][x - 1] != 0)
			dfs(x - 1, y, l + 1);

		if (x < n - 1 && matrix[y][x + 1] != 0)
			dfs(x + 1, y, l + 1);

		matrix[y][x] = 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShortestPath sp = new ShortestPath();

		sp.dfs(0, 0, 1);

		System.out.println(min);
	}

}
