package plyMorphism;

public class Main {

	public static void main(String[] args) {
		Home h = new Home();
		House H = h;
		h.floor();
		H.floor();
		System.out.println(h.name+ "   vs   " +H.name);
		String s = "fad";
		s.sub
		kitchen("Mommy" , "Daddy");

	}
	static void kitchen() {
		System.out.println("Kitchen Must be Modular !...");
	}
	static void kitchen(String mod) {
		System.out.println("Kitchen Should be Simple !...");
	}
	static void kitchen(String mod, String dom) {
		System.out.println(mod + "    vs    " +dom);
	 }

}
