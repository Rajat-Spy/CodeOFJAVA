package apple_Java;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		int n =sc.nextInt();
		int m = sc.nextInt();
		int multiply = 1;
//		int a = 0, b = 1;
//		System.out.print(a+" "+b+" ");
		for(int i=0;i<m;i++) {
//			int temp = a+b;
//			a=b;
//			b=temp;
//			System.out.print(temp+" ");
			multiply *= n;
		}
		System.out.println(multiply);

	}
}
