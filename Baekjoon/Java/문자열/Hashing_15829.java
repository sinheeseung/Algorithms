package ¹®ÀÚ¿­;

import java.math.*;
import java.util.Scanner;
public class Hashing_15829 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String text  = input.next();
		long sum = 0, temp = 1, t = 1234567891;
		for(int i=0;i<n;i++) {
			int a = text.charAt(i) - 'a' + 1;
			sum = (sum + a * temp) % t;
			temp = temp * 31;
			temp = temp % t;
		}
		System.out.println(sum%1234567891);

	}

}
