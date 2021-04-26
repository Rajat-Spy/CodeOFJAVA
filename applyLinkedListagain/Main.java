package applyLinkedListagain;

public class Main {

	public static void main(String[] args) throws Exception {
		MyLinkedList<Integer> mll = new MyLinkedList<>();
		mll.add(45);
		mll.add(100);
		mll.add(87);
		mll.add(55);
		mll.remove(2);
		mll.print();

	}

}
