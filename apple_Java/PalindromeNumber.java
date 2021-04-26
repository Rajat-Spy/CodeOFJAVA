package apple_Java;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int b = 0;
		while(temp>0) {
			int c = temp%10;
			b = b*10 +c;
			temp /= 10;
		}
		if(a == b) {
			System.out.println("Palindrome");
		} else 
			System.out.println("Not Palindrome");
	}

}
