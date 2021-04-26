package ball_Java;

import java.util.Scanner;

public class SelectionSort {

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
			int min = i;
			for(int j=i;j<n;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println("-------------------------------------");
		System.out.println("Sorted Array is : ");
		for(int e:arr) {
			System.out.print(e+"  ");
		}

	}

}
