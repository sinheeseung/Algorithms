import java.util.Queue;
import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
public class ť_10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Integer> queue = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		String command;
		int num;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			command = st.nextToken();
			if (command.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				queue.add(num);
			}
			if (command.equals("pop")) {
				if(queue.size() == 0)
					System.out.println(-1);
				else
					System.out.println(queue.poll());
			}
			if (command.equals("size")) {
				System.out.println(queue.size());
			}
			if (command.equals("empty")) {
				if(queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			if (command.equals("front")) {
				if(queue.size()==0)
					System.out.println(-1);
				else
					System.out.println(queue.peek());
			}
			if (command.equals("back")) {
				if(queue.size()==0)
					System.out.println(-1);
				else
					System.out.println(queue.toArray()[queue.size()-1]);
			}
		}

	}

}
