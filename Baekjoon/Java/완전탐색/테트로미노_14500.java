package ��Ʈ�ι̳�_14500;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int arr[][] = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = input.nextInt();
			}
		}
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i+3 <n)
//					��
//					��
//					��
//					��
					max = Math.max(max, arr[i][j] + arr[i+1][j]+arr[i+2][j] +arr[i+3][j]);
				if(j+3 < m)
					//��������
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i][j+2] +arr[i][j+3]);
				if(i+1 < n && j+1 < m)
					//����
					//����
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i+1][j] +arr[i+1][j+1]);
				if(i+2 < n && j+1 < m) {
					//��
					//��
					//����
					max = Math.max(max, arr[i][j] + arr[i+1][j]+arr[i+2][j] +arr[i+2][j+1]);
					//����
					// ��
					// �� 
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i+1][j+1] +arr[i+2][j+1]);	
					//��
					//����
					// ��
					max = Math.max(max, arr[i][j] + arr[i+1][j]+arr[i+1][j+1] +arr[i+2][j+1]);
					//��
					//����
					//��
					max = Math.max(max, arr[i][j] + arr[i+1][j]+arr[i+1][j+1] +arr[i+2][j]);
					//����
					//��
					//��
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i+1][j] +arr[i+2][j]);
				}
				if(i+1 < n && j+2 < m) {
					//������
					//��
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i][j+2] +arr[i+1][j]);
					//������
					// ��
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i][j+2] +arr[i+1][j+1]);
					//��
					//������
					max = Math.max(max, arr[i][j] + arr[i+1][j]+arr[i+1][j+1] +arr[i+1][j+2]);
					//������
					//   ��
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i][j+2] +arr[i+1][j+2]);
					//����
					// ����
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i+1][j+1] +arr[i+1][j+2]);
				}
				if(i-1 >= 0 && j+2 < m) {
					//   ��
					//������
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i][j+2] +arr[i-1][j+2]);
					// ����
					//����
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i-1][j+1] +arr[i-1][j+2]);
					// ��
					//������
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i-1][j+1] +arr[i][j+2]);
				}
				if(i-1 >= 0 && i+1 < n && j+1 < m) {
					// ��
					//����
					// ��
					max = Math.max(max, arr[i][j] + arr[i-1][j+1]+arr[i][j+1] +arr[i+1][j+1]);
					// ��
					//����
					//��
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i+1][j] +arr[i-1][j+1]);
				}
				if(i-2 >= 0 && j+1 < m)
					// ��
					// ��
					//����
					max = Math.max(max, arr[i][j] + arr[i][j+1]+arr[i-1][j+1] +arr[i-2][j+1]);
			}
		}
		System.out.println(max);
	}

}
