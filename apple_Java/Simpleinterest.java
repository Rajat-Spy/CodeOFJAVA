package apple_Java;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle amount: ");
		int p = sc.nextInt();
		System.out.println("Enter the rate of Interst: ");
		float r = sc.nextFloat();
		System.out.println("Enter the year: ");
		int t = sc.nextInt();
		long SI = (long)(p*r*t)/100;
		System.out.println(SI);
		
	}

}
