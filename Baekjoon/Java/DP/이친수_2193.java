package ÀÌÄ£¼ö_2193;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long arr[] = new long[n+1];
		if(n <= 1)
			System.out.println(1);
		else {
			arr[0] = 1;
			arr[1] = 1;
			for(int i=2;i<n;i++) {
				arr[i] = arr[i-1]+arr[i-2];
			}
			System.out.println(arr[n-1]);
		}
		
		
	}

}
