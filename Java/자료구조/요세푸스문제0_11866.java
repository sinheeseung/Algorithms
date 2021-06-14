package 자료구조;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class 요세푸스문제0_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int arr[] = new int[n + 1];
		int arr_n[] = new int[n + 1];
		boolean arr_1[] = new boolean[n + 1];
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
			arr_1[i] = false;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				cnt = (cnt + 1);
				if (cnt > n)
					cnt = cnt % n;
				while (arr_1[cnt] == true) {
					cnt++;
					if (cnt > n)
						cnt = cnt % n;
				}
				if (cnt > n)
					cnt = cnt % n;

			}
			arr_1[cnt] = true;
			arr_n[i] = arr[cnt];
		}
		System.out.print("<");
		for (int i = 0; i < n; i++) {
			if (i != n - 1)
				System.out.print(arr_n[i] + ", ");
			else
				System.out.print(arr_n[i]);
		}
		System.out.print(">");
	}

}
