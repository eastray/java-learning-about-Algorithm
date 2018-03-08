package bfs;

public class ShortestPath {
	static int n = 6;
	static int cnt = 0;
	static int[][] matrix = { { 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 1, 0 },
			{ 1, 1, 1, 0, 1, 0 }, { 0, 0, 1, 1, 1, 1 } };

	static int[] x = new int[100];
	static int[] y = new int[100];
	static int[] l = new int[100];

	void enqueue(int a, int b, int c) {
		x[cnt] = a;
		y[cnt] = b;
		l[cnt] = c;
		cnt++;
	}

	void bfs(int a, int b) {
		int pos = 0;

		enqueue(a, b, 1);

		while (pos < cnt && (x[pos] != n - 1 || y[pos] != n - 1)) {

			matrix[y[pos]][x[pos]] = 0;

			if (y[pos] > 0 && matrix[y[pos] - 1][x[pos]] == 1)
				enqueue(x[pos], y[pos] - 1, l[pos] + 1);

			if (y[pos] < n - 1 && matrix[y[pos] + 1][x[pos]] == 1)
				enqueue(x[pos], y[pos] + 1, l[pos] + 1);

			if (x[pos] > 0 && matrix[y[pos]][x[pos] - 1] == 1)
				enqueue(x[pos] - 1, y[pos], l[pos] + 1);

			if (x[pos] < n - 1 && matrix[y[pos]][x[pos] + 1] == 1)
				enqueue(x[pos] + 1, y[pos], l[pos] + 1);

			pos++;
		}

		if (pos < cnt)
			System.out.println("최단 경로 길이: " + l[pos]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShortestPath sp = new ShortestPath();

		sp.bfs(0, 0);
	}

}
