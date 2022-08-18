package 자료구조;

import java.util.StringTokenizer;
import java.io.*;
public class 스택_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		String command;
		int arr[] = new int[10000];
		int cnt = 0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			command = st.nextToken();
			if(command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				arr[cnt] = num;
				cnt++;
			}
			else if(command.equals("pop")) {
				if(cnt > 0) {
					System.out.println(arr[cnt-1]);
					arr[cnt-1] = 0;
					cnt--;
				}
				else
					System.out.println(-1);

			}
			else if(command.equals("size")) {
				System.out.println(cnt);
			}
			else if(command.equals("empty")) {
				if(cnt == 0)
					System.out.println(1);
				else 
					System.out.println(0);
			}
			else{
				if(cnt > 0)
					System.out.println(arr[cnt-1]);
				else 
					System.out.println(-1);
			}
		}
	}

}
