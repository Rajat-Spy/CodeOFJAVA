package queueTutorial;

public class Main {

	public static void main(String[] args) {
		MyQueue<Integer> mq = new MyQueue<>();
		mq.Enqueue(56);
		mq.Enqueue(76);
		mq.Enqueue(43);
		mq.Enqueue(1);
		mq.Enqueue(100);
		
		mq.Dequeue();
//		System.out.println(mq.Dequeue());
//		System.out.println(mq.Dequeue());System.out.println(mq.Dequeue());
		System.out.println(mq.peek());

	}

}
