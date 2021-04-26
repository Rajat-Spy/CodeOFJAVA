package cat_Java;

public class IsValue_Reference {

	public static void main(String[] args) {
//		int c= 12;
//		int d= 13;
//		swap(c, d);
//		System.out.println(c+"  "+d);
//		mac obj1 = new mac();
//		obj1.screen = 3;
//		mac obj2 = new mac();
//		obj2.screen = 4;
//		swap(obj1,obj2);
		mac p = new mac();
		p.screen = 1;
		changeit(p);
		System.out.println(p.screen);
		int arr[] = {1,2,3,4,5};
		Stringbuffer s = new Stringbuffer();
		s.ap

	}
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	static void swap(mac m, mac n) {
		mac temp = m;
		m = n;
		n = temp;
	}
	static void changeit(mac Mac) {
		Mac.screen = 6;
	}

}
class mac {
	int screen=4;
}
