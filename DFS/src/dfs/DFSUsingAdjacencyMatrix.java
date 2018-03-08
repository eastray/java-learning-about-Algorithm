package dfs;

public class DFSUsingAdjacencyMatrix {

	static int n = 8;
	static int[] visit = new int[n + 1];
	static int[][] matrix = new int[n + 1][n + 1];

	private int[][] createMatrix(String edge) {

		for (int i = 0; i < edge.length(); i = i + 2) {
			int a = Integer.parseInt(edge.substring(i, i + 1));
			int b = Integer.parseInt(edge.substring(i + 1, i + 2));

			matrix[a][b] = matrix[b][a] = 1;
		}

		return matrix;

	}

	private void dfs(int start) {
		visit[start] = 1;

		for (int i = 1; i <= n; i++) {
			if (matrix[start][i] == 1 && visit[i] == 0) {
				System.out.println(start + " --> " + i);

				dfs(i);
			}
		}
	}

	public static void main(String[] args) {

		int start = 1;

		DFSUsingAdjacencyMatrix dfs = new DFSUsingAdjacencyMatrix();

		String edge = "12132425485836376878";

		dfs.createMatrix(edge);

		for (int[] elements : matrix) {

			for (int ele : elements)
				System.out.print(ele + " ");

			System.out.println();
		}

		dfs.dfs(start);

	}
}
