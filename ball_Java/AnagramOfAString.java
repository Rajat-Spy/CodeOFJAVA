package ball_Java;

import java.util.Scanner;

public class AnagramOfAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words to check:  ");
		String word = sc.nextLine();
		String word2 = sc.nextLine();
		boolean isAnagram = true;
//		boolean check[] = new boolean[word2.length()];
//		if(word.length() == word2.length()) {
//			for(int i=0;i<word.length();i++) {
//				char c = word.charAt(i);
//				isAnagram = false;
//				for(int j=0;j<word2.length();j++) {
//					if(word2.charAt(j) == c && !check[j]) {
//						isAnagram = true;
//						check[j] = true;
//						break;
//					}
//				}
//				if(!isAnagram)
//					break;
//			}
//			
//		}
		
		int al[] = new int[256];
		for(char c : word.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		
		for(char c: word2.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		for(int i=0;i<256;i++) {
			if(al[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		if(isAnagram)
			System.out.println("Both Words are like each other!");
		else
			System.out.println("Both words are different!");
	}

}
