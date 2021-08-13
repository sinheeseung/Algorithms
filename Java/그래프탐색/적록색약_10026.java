package 적록색약_10026;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	private static int visited[][];
	private static char arr[][];
	private static int d_x[] = {-1,1,0,0};
	private static int d_y[] = {0,0,-1,1};
	private static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		int count=0;
		arr = new char[n][n];
		visited = new int[n][n];
		
		for(int i=0;i<n;i++) {
			String text = br.readLine();
			for(int j=0;j<n;j++) {
				arr[i][j] = text.charAt(j);
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(visited[i][j] == 0) {
					visited[i][j] = 1;
					count++;
					bfs(i,j);
				}
			}
		}
		System.out.print(count +" ");
		count = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				visited[i][j] = 0;
				if(arr[i][j] == 'G')
					arr[i][j] = 'R';
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(visited[i][j] == 0) {
					visited[i][j] = 1;
					count++;
					bfs(i,j);
				}
			}
		}
		System.out.println(count);
	}
	
	private static void bfs(int i, int j) {
		Queue<String> queue = new LinkedList<String>();
		queue.add(i + "," + j);
		while(!queue.isEmpty()) {
			String line = queue.poll();
			int index = line.indexOf(",");
			int y = Integer.parseInt(line.substring(0,index));
			int x = Integer.parseInt(line.substring(index+1));
			
			for(int k=0;k<4;k++) {
				int dx = x + d_x[k];
				int dy = y + d_y[k];
				if(0 <= dx && dx < n && 0 <= dy && dy < n && visited[dy][dx] == 0 && arr[dy][dx] == arr[i][j]) {
					queue.add(dy + "," + dx);
					visited[dy][dx] = 1;
				}
			}
		}
	}

}
