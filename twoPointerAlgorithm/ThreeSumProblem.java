package twoPointerAlgorithm;
import java.util.*;
public class ThreeSumProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Test cases..");
		int t = sc.nextInt();
		while(t-->0) {
		System.out.println("Enter the Number of Elements in the array...");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elememts of the array:  ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		if(threeSum(arr,n))
			System.out.println("1");
		else
			System.out.println("0");
		}
	}
	public static boolean twoSum(int a[], int x, int i) {
		int j = a.length-1;
		while(i<j) {
			if(a[i]+a[j] < x) i++;
			else if(a[i]+a[j] > x) j--;
			else {
				return true;}
		}
		return false;
	}
	public static boolean threeSum(int arr[], int n) {
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(twoSum(arr, -arr[i], i+1))
				return true;
		}
		return false;
	}

}
