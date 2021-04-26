package stackTutorial;

public class Main {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> ms = new MyStack<>();
		ms.push(12);
		ms.push(45);
		ms.push(66);
		System.out.println(ms.pop());
//		System.out.println(ms.pop());
		System.out.println(ms.peek());

	}

}
