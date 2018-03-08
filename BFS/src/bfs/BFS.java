package bfs;

public class BFS {

	static int n = 0;
	static int rear, front = 0;
	static int[][] matrix = new int[30][30];
	static int[] queue = new int[30];
	static int[] visited = new int[30];

	public void bfs(int v) {

		visited[v] = 1;
		queue[rear++] = v;

		while (front < rear) {
			v = queue[front++];

			for (int i = 1; i <= n; i++) {
				if (matrix[v][i] == 1 && visited[i] != 1) {

					visited[i] = 1;
					System.out.println(v + " --> " + i);

					queue[rear++] = i;

				}
			}

		}

	}

	private int[][] createMatrix(String edge) {

		for (int i = 0; i < edge.length(); i = i + 2) {
			int a = Integer.parseInt(edge.substring(i, i + 1));
			int b = Integer.parseInt(edge.substring(i + 1, i + 2));

			matrix[a][b] = matrix[b][a] = 1;
		}

		return matrix;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		n = 6;
		int start = 1;

		BFS bfs = new BFS();

		bfs.createMatrix("121324253436454656");

		bfs.bfs(start);

	}

}
