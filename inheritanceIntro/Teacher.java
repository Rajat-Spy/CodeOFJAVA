package inheritanceIntro;

public class Teacher extends Person{

	Teacher(String name) {
		super(name);
		System.out.println(name+ " is in Teacher Constructor! ");
	}

}
