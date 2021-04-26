package inheritanceIntro;

public class Footballer extends Person{
	Footballer(String name){
		super(name);
		System.out.println(name+ " is in the Footballer Constructor! ");
	}
	public void eat() {
		super.eat();
		System.out.println(name+ " is eating! ");
	}
	public void play() {
		System.out.println(name+" is Playing! " );
	}
}
