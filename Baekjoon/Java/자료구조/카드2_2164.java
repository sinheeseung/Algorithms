package 자료구조;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
public class 카드2_2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		while(queue.size() > 1) {
			queue.remove();
			queue.add(queue.poll());
		}
		System.out.println(queue.peek());
	}

}
