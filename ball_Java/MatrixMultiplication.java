package ball_Java;
import java.util.Scanner;
public class MatrixMultiplication {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n,m: ");
	int n = sc.nextInt();
	int m = sc.nextInt();
	int [][] a = new int[n][m];
	int[][] b = new int[m][n];
	System.out.println("Enter the elements of a: ");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j] = sc.nextInt();
		}
	}
	System.out.println("Enter the elements of b: ");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			b[i][j] = sc.nextInt();
		}
	}
	int[][] c = new int[m][m];
	System.out.println("After Multiplication: ");
	for(int i=0;i<m;i++) {
		for(int j=0;j<m;j++) {
			c[i][j] += a[i][j]*b[i][j];
			System.out.print(c[i][j]+" ");
			}
		System.out.println();
	}
	

	}

}
