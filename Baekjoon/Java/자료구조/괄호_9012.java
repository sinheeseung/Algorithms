package �ڷᱸ��;

import java.io.*;
public class ��ȣ_9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = br.readLine();
		}
		for(int i=0;i<n;i++) {
			int cnt = 0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j) == '(')
					cnt++;
				else
					cnt--;
				if(cnt < 0) break;
			}
			if(cnt == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
