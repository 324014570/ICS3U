package alKwiliy;

import java.util.Scanner;
/**
 * this program rewrites a sentence the user inputs, backwards.
 * @author Fayez Al-kwiliy, Tenzing Kelsang, Adam Seftel, Kaazim Patel, Yonis Nur
 *11/04/2017
 */
public class BackwardsWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String[] sentence = sc.nextLine().split(" ");
		String x = "";
		for (int i = 0; i < sentence.length; i++) {
			for (int j = sentence[i].length() - 1; j >= 0; j--) {
				if (((Character) (sentence[i].charAt(0))).toString().matches("[A-Z]")) {
					if (j == sentence[i].length() - 1) {
						System.out.print(Character.toUpperCase(sentence[i].charAt(j)));
					} else {
						System.out.print(Character.toLowerCase(sentence[i].charAt(j)));
					}
				} else {
					System.out.print(sentence[i].charAt(j));
				}


			}
			System.out.print(" ");
		}
	}
}
