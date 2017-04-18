package alKwiliy;

import java.util.Scanner;
/**
 * This program checks if the word is a palindrome or not 
 * @author Fayez Al-kwiliy
 *18/04/2017
 */
public class Palindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word = sc.nextLine();
		if (isPalindrome(word)){
			System.out.println("This is a palindrome");
		}
		else{
			System.out.println("This isn't a palindrome.");
		}
	}
	public static boolean isPalindrome(String word){
		String backwardsWord = "";
		for (int j = word.length()-1; j >= 0; j--){
			backwardsWord = backwardsWord + word.charAt(j);
		}
		if (backwardsWord.equalsIgnoreCase(word)){
			return true;
		}
		return false;
	}

}
