package ball_Java;
import java.util.Scanner;
public class SortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements you want to sort : ");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			boolean isSort = true;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					isSort  = false;
				}
			}
			if(isSort) break;
		}
		System.out.println("The Sorted array is : ");
		for(int e:arr) {
		System.out.print(e+"  ");
		}
		
	}

}
