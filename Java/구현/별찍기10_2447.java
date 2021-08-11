package º°Âï±â10_2447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class Main {
	public static char arr[][] = new char[2187][2187];
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = ' ';
			}
		}
		fprint(0,0,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				bw.write(arr[i][j]);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	public static void fprint(int a,int b, int n) {
		if(n < 3) {
			arr[a][b] = '*';
			return;
		}
		else {
			n =n / 3;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i != 1 || j != 1) {
						fprint(a+(n*i),b+(n*j),n);
					}
				}
			}
			return;
		}

	}

}
