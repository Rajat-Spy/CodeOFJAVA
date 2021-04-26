package cat_Java;

import java.util.Scanner;

public class ReverseOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:  ");
		String sentence = sc.nextLine();
		int i = sentence.length()-1;
		String ans = "";
		while(i>=0 && sentence.charAt(i) == ' ') {  i--;
		if(i<0) break;}
		int j = i;
		while(i>=0 && sentence.charAt(i) != ' ') i--;
		if(ans.isEmpty()) {
			ans = ans.concat(sentence.substring(i+1, j+1));
		} else {
		ans = ans.concat(" "+sentence.substring(i+1, j+1));
		}
		System.out.println(ans);
		Integer.
	}
	

}
