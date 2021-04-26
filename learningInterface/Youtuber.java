package learningInterface;

public interface Youtuber {
	
	void makeVideo();
	default void speak() {
		System.out.println("This is in the Youtuber Inteface");
	}

}
