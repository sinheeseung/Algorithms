package ÀÚ·á±¸Á¶;

import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.*;

public class µ¦_10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Deque deque = new LinkedList<>();
		String command;
		int num;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			command = st.nextToken();
			if (command.equals("push_front")) {
				num = Integer.parseInt(st.nextToken());
				deque.addFirst(num);
			}
			if (command.equals("push_back")) {
				num = Integer.parseInt(st.nextToken());
				deque.addLast(num);
			}
			if (command.equals("pop_front")) {
				if(deque.size() == 0)
					System.out.println(-1);
				else
					System.out.println(deque.pollFirst());
			}
			if (command.equals("pop_back")) {
				if(deque.size() == 0)
					System.out.println(-1);
				else
					System.out.println(deque.pollLast());
			}
			if (command.equals("size")) {
				System.out.println(deque.size());
			}
			if (command.equals("empty")) {
				if(deque.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			if (command.equals("front")) {
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.getFirst());
			}
			if (command.equals("back")) {
				if(deque.isEmpty())
					System.out.println(-1);
				else
					System.out.println(deque.getLast());
			}
		}
	}

}
