package learningInterface;

public class PersonMain implements Student, Youtuber{
	
	public static void main(String[] args) {
		PersonMain p = new PersonMain();
		p.learn();
		p.makeVideo();
		p.speak();
	}

	@Override
	public void makeVideo() {
		System.out.println("This Prints the Youtuber method !...");
		
	}

	@Override
	public void learn() {
		System.out.println("This prints the Student method !...");
		
	}
	

}
