import java.io.*;
public class Á¦·Î_10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		int cnt = 0;
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				arr[cnt-1] = 0;
				cnt--;
			}
			else {
				arr[cnt] = n;
				cnt++;
			}
		}
		long sum=0;
		for(int i=0;i<cnt;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
