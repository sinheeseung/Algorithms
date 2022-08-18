import java.io.*;
public class FourSquares_17626 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[]= new int[n+1];
		for(int i=1;i<=n;i++) {
			int min = Integer.MAX_VALUE;
			if(i == 1) {
				arr[0] = 0;
				arr[1] = 1;
			}
			else {
				for(int j=1;j*j<=i;j++) {
					min = Math.min(min, arr[i-j*j]+1);
				}
				arr[i] = min;
			}
		}
		System.out.print(arr[n]);
	}

}
