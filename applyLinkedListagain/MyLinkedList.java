package applyLinkedListagain;

public class MyLinkedList<E> {
	
	Node<E> head;
	
	public void add(E e) {
		Node<E> toadd = new Node<>(e);
		if(isEmpty()) {
			head = toadd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toadd;
	}
	
	public E get() throws Exception{
		if(isEmpty()) {
			throw new Exception("This is an Exception!...");
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node<E> toget = temp;
		return toget.data;
	}
	public E remove() throws Exception {
		if(isEmpty()) {
			throw new Exception("This is an Exception!..");
		}
		Node<E> temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toremove = temp.next;
		temp.next = null;
		return toremove.data;
		
	}
	
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public static class Node<E> {
		public E data;
		public Node<E> next;
		public Node(E e) {
			this.data = e;
			next = null;
		}
	}

}
