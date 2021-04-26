package queueTutorial;

import applyLinkedListagain.MyLinkedList.Node;

public class MyQueue<E> {
	
	private Node<E> head, rear;
	
	void Enqueue(E e) {
		Node<E> toAdd = new Node<>(e);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	E Dequeue() {
		if(head == null) {
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		return temp.data;
	}
	E peek() {
		if(head == null) {
			return null;
		}
		return head.data;
	}
}
