package alKwiliy;
/**
 * PythagoreanTriples.java
 * This program displays all pythagorean triples with values of a and b less than 100 
 * @author Fayez Al-kwiliy
 *20/04/2017
 */
public class PythagoreanTriples {

	public static void main(String[] args) {
		int c;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				c = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
				if (perfectSquares(c)) {
					System.out.println(a + "^2" + " + " + b + "^2" + " = " + (int) Math.sqrt(c) + "^2");
				}
			}
		}

	}
	/**
	 * This method checks if the value is a perfect square
	 * @param n checked to see if it's a perfect square
	 * @return true if the square root is a whole number, false otherwise
	 */
	public static boolean perfectSquares(int n) {
		int x = (int) Math.sqrt(n);
		double check = Math.pow(x, 2);
		if (n == check) {
			return true;
		}
		return false;
	}

}
