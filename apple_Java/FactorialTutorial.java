package apple_Java;

import java.util.Scanner;

public class FactorialTutorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for which you have to find factorial:  ");
		int a = sc.nextInt();
		System.out.println(factorial(a));
	}
	static long factorial(int n) {
		long factorial = 1;
		for(int i=n;i>=1;i--) {
			factorial *= i;
		}
		return (long)factorial;
	}
	

}
