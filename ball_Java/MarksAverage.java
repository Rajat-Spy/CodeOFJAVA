package ball_Java;
import java.util.Scanner;
public class MarksAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextDouble();
		}
		double avg = 0;
		for(int i=0;i<n;i++) {
			avg += a[i];
		}
		avg = avg/n;
		System.out.println(avg);
	}

}
