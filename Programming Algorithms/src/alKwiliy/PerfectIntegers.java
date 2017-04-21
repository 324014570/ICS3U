package alKwiliy;
/**
 * PerfectIntegers.java
 * This program finds all the perfect integers between 1 and 100
 * @author Fayez Al-kwiliy
 *21/04/2017
 */
public class PerfectIntegers {

	public static void main(String[] args) {
		System.out.println("The perfect integers from 1 to 100 are:");
		for (int j = 99; j>0; j--){
		if(isPerfect(j)){
			System.out.println(j);
		}
		}	
			
			

	}
	/**
	 * This method checks if the value is a perfect integer
	 * @param a the value that is checked
	 * @return true if it is a perfect integer, false otherwise
	 */
	public static boolean isPerfect(int a){
		int c = 0;
			for (int x =1; x<a; x ++){
				if (a%x == 0){
					c = c + x;
				}
			
			
			}
			if (c == a){
				return true;
			}
		
		return false;
	}

}
