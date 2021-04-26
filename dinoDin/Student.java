package dinoDin;

public class Student {
	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18) {
		this.age = age;
		} else
			System.out.println("Sorry! 18 above only...");
	}
}
