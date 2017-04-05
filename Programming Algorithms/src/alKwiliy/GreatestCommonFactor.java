package alKwiliy;

import java.util.Scanner;
/**
 * GreatestCommonFactor.java
 * This program finds the GCF of two numbers
 * @author Fayez Al-kwiliy
 *05/04/17
 */
public class GreatestCommonFactor {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your first number");
		int num1 = sc.nextInt();
		System.out.println("Enter your second number");
		int num2 = sc.nextInt();
		System.out.println("The greatest common factor of the 2 numbers is " +GCF(num1, num2));
	}



	/**
	 * This method finds the greatest common factor of two numbers
	 * @param num1 this is the first number
	 * @param num2 this is the second number
	 * @return the greatest common factor of the two numbers
	 */
	public static int GCF(int num1, int num2){

		if (num1 > num2){
			for(int i = num1; i>0; i--){
				if(isDivisible(num1, i)==true && isDivisible(num2, i) == true){
					return i;
				}
			}
		}
		if (num2 > num1){
			for(int i = num2; i>0; i--){
				if(isDivisible(num1, i)==true && isDivisible(num2, i) == true){
					return i;

				}
			}

		}

		return num1;
	}

	/**
	 * This method tests if two numbers are divisible by each other
	 * @param x this is the first number
	 * @param y this is the second number
	 * @return true or false if the two numbers are divisible by each other
	 */
	public static boolean isDivisible(int x, int y){
		if(x%y == 0){
			return true;
		}
		return false;
	}



}
