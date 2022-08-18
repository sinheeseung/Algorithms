package ¿ÏÀüÅ½»ö;

import java.util.Scanner;

public class ¿µÈ­°¨µ¶¼ò_1436 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,cnt=0,i=666,cnta,b;
		n = input.nextInt();
		while(true) {
			cnta =0;
			int a = i;
			b = 0;
			while(a > 0) {
				if(b >= 3) break;
				if(a % 10 == 6) {
					cnta++;
					b++;
				}
				else {
					b = 0;
				}
				a = a / 10;
			}
			if(cnta >= 3 && b >= 3) cnt++;
			if(cnt == n) break;
			i++;
		}
		System.out.println(i);
	}
}