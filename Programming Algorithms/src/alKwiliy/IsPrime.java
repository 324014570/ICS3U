package alKwiliy;

import java.util.Scanner;
/**
 * IsPrime.java
 * This program checks and outputs if a number is prime or not
 * @author Fayez Al-kwiliy
 *05/04/2017
 */
public class IsPrime {

	public static void main(String[] args) {
		System.out.println("Please enter a number.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (primeNum(num) == true) {
			System.out.println("Your number is a prime number");
		} else if (primeNum(num) == false) {
			System.out.println("Your number is not a prime number");
		}

	}
	/**
	 * This method tests if two numbers are divisible by each other
	 * @param a this is the first number
	 * @param b this is the second number
	 * @return true or false if the two numbers are divisible by each other
	 */
	public static boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}
	/**
	 * This method checks if the number is divisible by any number that is less than it other than 1
	 * @param num the number the user inputs
	 * @return true or false  if the number is divisible by any number less than it other than itself and 1
	 */
	public static boolean primeNum(int num) {
		for (int n = 2; n < num; n++) {
			if (IsPrime.isDivisible(num, n) == true) {
				return false;
			}
		}
		return true;
	}
}