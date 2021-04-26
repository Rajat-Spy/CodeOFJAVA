package queuePriority;
import java.util.*;
import java.util.Deque;
import java.util.PriorityQueue;

public class IntroPriority {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(56);
		p.add(12);
		p.add(100);
		p.add(34);
		System.out.println(p);
		System.out.println(p.remove());
		System.out.println(p.remove());
		System.out.println(p.remove());
		System.out.println(p.remove());
		System.out.println("-----------------------------------------------------------");
		Deque<Integer> dq = new LinkedList<>();
		dq.addLast(45);
//		dq.removeFirst();
		dq.addFirst(67);
		System.out.println(dq.contains(45));
		System.out.println(dq);

	}

}
