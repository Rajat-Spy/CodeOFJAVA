package stackTutorial;

import applyLinkedListagain.MyLinkedList;

public class MyStack<E> {
	private MyLinkedList<E> ml = new MyLinkedList<>();
	
	void push(E e) {
		ml.add(e);
	}
	E pop() throws Exception {
		if(ml.isEmpty()) {
			throw new Exception("This is an Exception y that you are searching for !...");
		}
		return ml.remove();
		
	}
	E peek() throws Exception {
		if(ml.isEmpty()) {
			throw new Exception("This is a Peeking Exception !..");
		}
		return ml.get();
	}

}
