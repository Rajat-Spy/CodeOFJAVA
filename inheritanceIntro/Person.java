package inheritanceIntro;

public class Person {
	protected String name;
	Person(String name){
		this.name  = name;
		System.out.println(name+ " is in Person Constructor;");
	}
	public void walk() {
		System.out.println("This shows that "+name+" is Walking! ");
	}
	public void talk() {
		System.out.println("This shows that "+name+" is talking! ");
	}
	public void eat() {
		System.out.println("This shows that "+name+" is eating! ");
	}

}
