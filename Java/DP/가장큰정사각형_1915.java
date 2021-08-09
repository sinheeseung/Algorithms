package 가장큰정사각형_1915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int dp[][] = new int[n][m];
		int max = 0;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
				dp[i][j] = arr[i][j];
				if (dp[i][j] > max)
					max = dp[i][j];
			}
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (arr[i][j] == 1) {
					dp[i][j] = arr[i][j] + Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]);
					if (dp[i][j] > max)
						max = dp[i][j];
				}
			}
		}
		System.out.println(max * max);
	}

}
