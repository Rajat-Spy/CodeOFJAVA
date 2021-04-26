package inheritanceIntro;

public class Student extends Person{
	Student(String name) {
		super(name);
		System.out.println(name+ " is in Student Constructor! ");
	}

	public void learn() {
		System.out.println(name+" is learning! ");
	}

}
