package arrayDequeClass;

import java.util.ArrayDeque;

public class IntroArrayDeque {
	public static void main(String[] args) {
		MyDeque<Integer> md = new MyDeque<>();
		md.addFirst(12);
		md.addLast(67);
		md.addLast(78);
		md.addFirst(34);
//		System.out.println(md.removelast());
//		System.out.println(md.removelast());
//		System.out.println(md.removelast());
//		System.out.println(md.removelast());
//		System.out.println(md.removeFirst());
//		System.out.println(md.removeFirst());
//		System.out.println(md.removeFirst());
		System.out.println(md.peeklast());
		System.out.println(md.peekfirst());
	}

}
