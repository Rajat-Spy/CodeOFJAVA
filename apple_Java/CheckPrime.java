package apple_Java;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check:  ");
		int a = sc.nextInt();
		boolean isPrime = true;
		if(a == 1) {
			System.out.println("Neither Prime Nor Composite!");
			break;
		}
		for(int i=2;i<a;i++) {
			if(a%i == 0)
				isPrime = false;
		}
		if(isPrime)
			System.out.println("Prime Number!");
		else
			System.out.println("Non Prime Number!");
	}
}
