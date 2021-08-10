package ≈‰∏∂≈‰_7569;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	private static int arr[][][];
	private static int time = 0;
	private static int m;
	private static int n;
	private static int h;
	private static int visited[][][];
	private static int dx[] = { -1, 1, 0, 0 };
	private static int dy[] = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();
		m = input.nextInt();
		n = input.nextInt();
		h = input.nextInt();
		arr = new int[h][n][m];
		visited = new int[h][n][m];
		int count_zero = 0;
		for (int l = 0; l < h; l++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[l][i][j] = input.nextInt();
					if (arr[l][i][j] == 1) {
						queue.add(String.valueOf(i) + "," + String.valueOf(j) + "." + String.valueOf(l));
						visited[l][i][j] = 1;
					}
					if (arr[l][i][j] == 0) {
						count_zero++;
					}
				}
			}
		}
		if (count_zero == 0)
			System.out.println(0);
		else {
			bfs(queue);
			for (int l = 0; l < h; l++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if (arr[l][i][j] == 0) {
							System.out.println(-1);
							return;
						}
					}
				}
			}
			System.out.println(time);
		}
	}

	private static int bfs(Queue<String> queue) {
		Queue<String> queue1 = new LinkedList<String>();
		while (!queue.isEmpty()) {
			String element = queue.poll();
			int index1 = element.indexOf(",");
			int index2 = element.indexOf(".");
			int y = Integer.parseInt(element.substring(0, index1));
			int x = Integer.parseInt(element.substring(index1 + 1, index2));
			int z = Integer.parseInt(element.substring(index2 + 1));
			arr[z][y][x] = 1;

			for (int i = 0; i < 4; i++) {
				int d_x = x + dx[i];
				int d_y = y + dy[i];
				if (0 <= d_x && d_x < m && 0 <= d_y && d_y < n) {
					if (visited[z][d_y][d_x] != 1 && arr[z][d_y][d_x] == 0) {
						queue1.add(String.valueOf(d_y) + "," + String.valueOf(d_x) + "." + String.valueOf(z));
						visited[z][d_y][d_x] = 1;
					}
				}
			}
			if (z < h - 1 && visited[z + 1][y][x] != 1 && arr[z + 1][y][x] == 0) {
				queue1.add(String.valueOf(y) + "," + String.valueOf(x) + "." + String.valueOf(z + 1));
				visited[z + 1][y][x] = 1;
			}
			if (0 < z && visited[z - 1][y][x] != 1 && arr[z - 1][y][x] == 0) {
				queue1.add(String.valueOf(y) + "," + String.valueOf(x) + "." + String.valueOf(z - 1));
				visited[z - 1][y][x] = 1;
			}
			
		}
		if (!queue1.isEmpty()) {
			time++;
			bfs(queue1);
		}
		return 0;
	}

}