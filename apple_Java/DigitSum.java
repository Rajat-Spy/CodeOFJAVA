package apple_Java;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int sum=0;
		while(temp>0) {
			a = temp%10;
			temp = temp/10;
			sum =sum+a;
		}
		System.out.println(sum);

	}

}
