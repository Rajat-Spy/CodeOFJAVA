package apple_Java;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=2*n;i++) {
			if(i<=n) {
			for(int j=1;j<=2*n;j++) {
				if(j<=n)
				System.out.print("* ");
			}
			System.out.println();
		}
		}
	}
}
