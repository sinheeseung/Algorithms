package 이분탐색;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.*;
public class 숫자카드2_10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		int arr[][] = new int[2][10000001];
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			int a= Integer.parseInt(st.nextToken());
			if(a < 0) {
				a = a * -1;
				arr[1][a]++;
			}
			else
				arr[0][a]++;
		}
		n = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			int a= Integer.parseInt(st.nextToken());
			if(a < 0) {
				a = a * -1;
				bw.write(arr[1][a] + " ");
			}
			else
				bw.write(arr[0][a] + " ");
		}
		bw.flush();
		bw.close();
	}

}
