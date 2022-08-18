package 자료구조;

import java.io.*;

public class 군형잡힌세상_4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		while(text.length() != 1 && text.charAt(0) != '.') {
			boolean a[]= new boolean[100];
			int count = 0;
			//true 소괄호 false 대괄호
			int count_1=0, count_2=0;
			for(int j=0;j<text.length();j++) {
				if(text.charAt(j) == '(') {
					a[count] = true;
					count_1++;
					count++;
				}
				if(text.charAt(j) == ')') {
					count_1--;
					count--;
					if(count_1 < 0 || a[count] == false) {
						count_1 = 1;
						break;
					}
				}
				if(text.charAt(j) == '[') {
					a[count] = false;
					count_2++;
					count++;
				}
				if(text.charAt(j) == ']') {
					count_2--;
					count--;
					if(count_2 < 0 || a[count] == true) {
						count_2 = 1;
						break;
					}
				}
			}
			if(count_1 == 0 && count_2 == 0)
				System.out.println("yes");
			else
				System.out.println("no");
			text = br.readLine();
		}

	}

}
