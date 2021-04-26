package twoSum;
import java.util.*;
public class UsingHashset {

	public static void main(String[] args) {
		int[] a = {1,-6,2,1};
		int k = 5;
		boolean isTrue = false;
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i: a) {
			set.add(sum);
			sum += i;
			
			if(set.contains(sum-k)) {
				isTrue = true;
				break;
			}
			if (isTrue)
				break;
		}
		System.out.println("Did we got the subarray sum 0 "+isTrue);

	}

}
