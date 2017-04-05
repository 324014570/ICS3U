package alKwiliy;

import java.util.Scanner;
/**
 * SumDigits.java
 * This program finds and outputs the sum of the digits in a number
 * @author Fayez Al-kwiliy
 *05/04/2017
 */
public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number.");
		int x = sc.nextInt();
		System.out.println("The sum of the digits of your number is " + (sumDigits(x)));
	}
	/**
	 * This method finds the sum of the digits of an integer value
	 * @param x the number the user inputs 
	 * @return the sum of the digits in the number
	 */
	public static int sumDigits(int x){
		int sum = 0;
		while (x>0){
			sum = sum + x % 10;
			x = x/10;

		}
		return sum;
	}

}
