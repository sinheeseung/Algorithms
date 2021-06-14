package 구현;

import java.util.Scanner;
public class 음계_2920 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,cnt_m=1,cnt_p=1;
		b = input.nextInt();
		for(int i=0;i<7;i++) {
			a = input.nextInt();
			if((a - b) == 1)  cnt_p++;
			else if((a - b) == -1) cnt_m++;
			b = a;
		}
		if(cnt_p == 8) System.out.println("ascending");
		else if(cnt_m == 8) System.out.println("descending");
		else System.out.println("mixed");
	}

}
