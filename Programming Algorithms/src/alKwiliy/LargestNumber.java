package alKwiliy;

import java.util.Scanner;
/**
 * LargestNumber.java
 * This program finds the largest number of an array of numbers and outputs it
 * @author Fayez Al-kwiliy
 *05/04/2017
 */
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of numbers");
		int n = sc.nextInt();
		int []num = new int [n];
		System.out.println("Enter " + n + " numbers one by one.");
		for (int x = 0; x<n; x++){
			num[x] = sc.nextInt();
		}
		System.out.println("The largest number is " + largestNum(num));

	}
	/**
	 * Finds the largest number of an array of number
	 * @param num the array of numbers the user inputs 
	 * @return The largest number in the array
	 */
	public static int largestNum(int[] num) {
		int maxNum = num[0];
		for (int i = 1; i < num.length; i++) {
			maxNum = Math.max(maxNum, num[i]);
		}
		return maxNum;
	}
}
