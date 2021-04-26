package cat_Java;


class home {
	int rooms;
	String color;
	home(int rooms){
		this.rooms = rooms;
	}
	home(String color, int rooms){
		this.rooms = rooms;
		this.color = color;
	}
}
public class MyConstructor {

	public static void main(String[] args) {
		home h = new home("Black",7);
		home h2 = new home(10);
		System.out.println(h.color);
		

	}

}
