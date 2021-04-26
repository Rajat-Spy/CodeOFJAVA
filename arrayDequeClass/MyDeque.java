package arrayDequeClass;

public class MyDeque<E> {
	
	Node<E> head, tail;
	public void addFirst(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head; 
		head = toAdd;
		
	}
	public E peeklast() {
		if(head == null) {
			return null;
		}
		if(tail.next == null) {
			return tail.data;
		}
		return tail.data;
		
	}
	public void addLast(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
		}
		tail.prev = toAdd;
		toAdd.next = tail;
		tail = toAdd;
		
	}
	public E peekfirst() {
		if(head == null) {
			return null;
		}
		if(head.prev == null) {
			return head.data;
		}
		return head.data;
	}
	public E removelast() {
		if(head == null) {
			return null;
		}
		if(tail.next == null) {
			return tail.data;
		}
		Node<E> toremove = tail;
		tail = tail.next;
		tail.prev = null;
		return toremove.data;
	}
	public E removeFirst() {
		if(head == null) {
			return null;
		}
		if(head.prev == null) {
			return head.data;
		}
		Node<E> toremove = head;
		head = head.prev;
		head.next = null;
		return toremove.data;
	}
	
	public static class Node<E> {
		E data;
		Node<E> next, prev;
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}

}
