package arrayListTutorial;

public class Pair<X, Y> {
	X x;
	Y y;
	
	Pair(X x, Y y){
		this.x = x;
		this.y = y;
	}
	
	public void getItNow() {
		System.out.println("This is " +x+ " and this is " +y);
	}

}
