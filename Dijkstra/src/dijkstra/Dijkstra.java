package dijkstra;

public class Dijkstra {

	private int node;
	private int metrix[][];

	public Dijkstra(int node) {
		super();
		this.node = node;
		this.metrix = new int[node + 1][node + 1];
	}

	private void inputMetrix(int i, int j, int z) {
		metrix[i][j] = metrix[j][i] = z;
	}

	private void dijkstra(int v) {
		int distance[] = new int[node + 1]; // 최단 거리를 저장할 변수
		boolean[] check = new boolean[node + 1]; // 해당 노드를 방문했는지 체크할 변수

		// distance값 초기화.
		for (int i = 1; i < node + 1; i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		// 시작노드값 초기화.
		distance[v] = 0;
		check[v] = true;

		// 연결노드 distance갱신
		for (int i = 1; i < node + 1; i++) {
			if (!check[i] && metrix[v][i] != 0) {
				distance[i] = metrix[v][i];
			}
		}

		for (int a = 0; a < node - 1; a++) {
			// 원래는 모든 노드가 true될때까지 인데
			// 노드가 n개 있을 때 다익스트라를 위해서 반복수는 n-1번이면 된다.
			// 원하지 않으면 각각의 노드가 모두 true인지 확인하는 식으로 구현해도 된다.
			int min = Integer.MAX_VALUE;
			int min_index = -1;

			// 최소값 찾기
			for (int i = 1; i < node + 1; i++) {
				if (!check[i] && distance[i] != Integer.MAX_VALUE) {
					if (distance[i] < min) {
						min = distance[i];
						min_index = i;
					}
				}
			}

			check[min_index] = true;
			for (int i = 1; i < node + 1; i++) {
				if (!check[i] && metrix[min_index][i] != 0) {
					if (distance[i] > distance[min_index] + metrix[min_index][i]) {
						distance[i] = distance[min_index] + metrix[min_index][i];
					}
				}
			}

		}

		// 결과값 출력
		for (int i = 1; i < node + 1; i++) {
			System.out.print(distance[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		Dijkstra dijkstra = new Dijkstra(8);
		dijkstra.inputMetrix(1, 2, 3);
		dijkstra.inputMetrix(1, 5, 4);
		dijkstra.inputMetrix(1, 4, 4);
		dijkstra.inputMetrix(2, 3, 2);
		dijkstra.inputMetrix(3, 4, 1);
		dijkstra.inputMetrix(4, 5, 2);
		dijkstra.inputMetrix(5, 6, 4);
		dijkstra.inputMetrix(4, 7, 6);
		dijkstra.inputMetrix(7, 6, 3);
		dijkstra.inputMetrix(3, 8, 3);
		dijkstra.inputMetrix(6, 8, 2);
		dijkstra.dijkstra(2);
	}
}
