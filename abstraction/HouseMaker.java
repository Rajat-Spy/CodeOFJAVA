package abstraction;

public class HouseMaker {
	
	static void maker(House house) {
		System.out.println("We are making it Done by Tommorrow !...");
	}

	public static void main(String[] args) {
		SeaView s = new SeaView();
		LandView l = new LandView();
		maker(l);
		maker(s);

	}

}
