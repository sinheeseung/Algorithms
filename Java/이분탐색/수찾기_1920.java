package 이분탐색;

import java.util.Scanner;
import java.util.Arrays;
public class 수찾기_1920 {
	public static int binary_search(int start, int end, int num, int[] arr) {
		int mid = (start + end) / 2;
		if(end < start)
			return 0;
		if(arr[mid] == num)
			return 1;
		else if(num < arr[mid]) {
			return binary_search(start, mid-1, num, arr);
		}
		else {
			return binary_search(mid+1, end, num, arr);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		n = input.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		m = input.nextInt();
		for(int i=0;i<m;i++) {
			System.out.println(binary_search(0,n-1,input.nextInt(), arr));
		}
	}

}
