package ≈‰∏∂≈‰_70112;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	private static int arr[][];
	private static int time = 0;
	private static int m;
	private static int n;
	private static int visited[][];
	private static int dx[] = {-1,1,0,0};
	private static int dy[] = {0,0,1,-1};	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();
		m = input.nextInt();
		n = input.nextInt();
		arr = new int[n][m];
		visited = new int[n][m];
		int count_zero = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = input.nextInt();
				if (arr[i][j] == 1) {
					queue.add(String.valueOf(i) + "," + String.valueOf(j));
					visited[i][j] = 1;
				}
				if (arr[i][j] == 0) {
					count_zero++;
				}
			}
		}
		if (count_zero == 0)
			System.out.println(0);
		else {
			bfs(queue);
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j] == 0) {
						System.out.println(-1);
						return;
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
			System.out.println(element);
			int index = element.indexOf(",");
			int y = Integer.parseInt(element.substring(0, index));
			int x = Integer.parseInt(element.substring(index + 1));
			arr[y][x] = 1;
			
			for(int i=0;i<4;i++) {
				int d_x = x + dx[i];
				int d_y = y + dy[i];
				if(0 <= d_x && d_x < m && 0 <= d_y && d_y < n && visited[d_y][d_x] != 1 && arr[d_y][d_x] == 0) {
					queue1.add(String.valueOf(d_y) + "," + String.valueOf(d_x));
					visited[d_y][d_x] = 1;
				}
			}
			
//			if (y < n-1 && arr[y + 1][x] == 0 && visited[y+1][x] != 1) {
//				queue1.add(String.valueOf(y + 1) + "," + String.valueOf(x));
//				visited[y+1][x] = 1;
//			}
//				
//			if (x < m-1 && arr[y][x + 1] == 0 && visited[y][x+1] != 1) {
//				queue1.add(String.valueOf(y) + "," + String.valueOf(x + 1));
//				visited[y][x+1] = 1;
//			}
//				
//			if (y > 0 && arr[y - 1][x] == 0 && visited[y-1][x] != 1) {
//				queue1.add(String.valueOf(y - 1) + "," + String.valueOf(x));
//				visited[y-1][x] = 1;
//			}
//				
//			if (x > 0 && arr[y][x - 1] == 0 && visited[y][x-1] != 1) {
//				queue1.add(String.valueOf(y) + "," + String.valueOf(x - 1));
//				visited[y][x-1] = 1;
//			}
				
		}
		if (!queue1.isEmpty()) {
			time++;
			bfs(queue1);
		}
		return 0;
	}

}
