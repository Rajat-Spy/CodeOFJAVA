package learnLinkedList;

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
		temp.next= toadd;
	}
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	public boolean isEmpty() {
		return head == null;
	}
	
	public class Node<E> {
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
