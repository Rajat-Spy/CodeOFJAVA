package learningException;

public class First {
	public static void main(String[] args) {
		int a = 9, b = 10;
		int c = a/b;
		System.out.println(c);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("This is the after dealy !...");
	}

}
