package º°Âï±â16;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			while(count <= i) {
				System.out.print("*");
				System.out.print(" ");
				count++;
			}
			System.out.println();
		}
		

	}

}
