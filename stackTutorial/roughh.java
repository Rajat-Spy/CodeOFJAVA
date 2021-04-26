package stackTutorial;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class roughh {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		int count = 0;
		Queue<Integer> q = new LinkedList<>();
		q.add(45);
		q.add(342);
		q.add(45);
		q.add(342);
		Collections.frequency(q, q);
		if(q.contains(342)) {
			count++;
		}
		System.out.println(count);
	}

}
