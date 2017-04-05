package alKwiliy;

import java.util.Scanner;
/**
 * Factorial.java
 * This program finds and outputs the factorial of a number
 * @author Fayez Al-kwiliy
 *05/04/2017
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int x = sc.nextInt();
		System.out.println("The factorial of this number is " + factorial(x));
	}
	/**
	 * the method finds the factorial of the number the user inputs
	 * @param x this is the number the user inputs
	 * @return the factorial of the number x
	 */
	public static int factorial (int x){
		for (int y = x - 1; y > 0;y --){

			x  = x * y;



		}
		return x;



	}
}
