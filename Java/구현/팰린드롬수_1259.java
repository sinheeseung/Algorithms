package 구현;

import java.util.Scanner;
public class 팰린드롬수_1259 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.next();
		while(!n.equals("0")) {
			int cnt = 0;
			for(int i=0;i<(n.length()/2);i++) {
				if(n.charAt(i) == n.charAt(n.length()-(i+1)))
					cnt++;
			}
			if(cnt == (n.length()/2))
				System.out.println("yes");
			else
				System.out.println("no");
			n = input.next();
		}

	}

}
