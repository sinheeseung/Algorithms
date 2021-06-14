package 그래프탐색;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class 단지번호붙이기_2667 {
	public static int cnt;
	public static int n;
	public static int arr[][];
	public static boolean visit[][];
	public static void dfs(int x, int y) {
		if(x >= n || y >= n || x < 0 || y < 0)
			return ;
		if(arr[x][y] == 0 || visit[x][y])
			return ;
		visit[x][y] = true;
		arr[x][y] = cnt;
		
		dfs(x+1,y);
		dfs(x,y+1);
		dfs(x-1,y);
		dfs(x,y-1);
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n][n];
		for(int i=0;i<n;i++) {
			String text = br.readLine();
			for(int j=0;j<n;j++) {
				arr[i][j] = Integer.parseInt(text.substring(j, j+1));
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j] != 0 && !visit[i][j]) {
					cnt++;
					dfs(i,j);
				}
					
			}
		}
		int count[] = new int[cnt];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j] != 0)
					count[arr[i][j]-1]++;
			}
		}
		Arrays.sort(count);
		System.out.println(cnt);
		for(int i=0;i<cnt;i++)
			System.out.println(count[i]);
	}

}
