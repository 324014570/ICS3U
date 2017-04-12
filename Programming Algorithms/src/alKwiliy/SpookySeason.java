package alKwiliy;

import java.util.Scanner;
/**
 * This program prints out spooky, with a cetain amount of o's depending on what the user inputs
 * @author Fayez Al-kwiliy, Tenzing Kelsang, Adam Seftel, Kaazim Patel, Yonis Nur
 *11/04/2017
 */
public class SpookySeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int s = sc.nextInt();
		if(2 <= s && s <= 20){
			String[]spooky = new String[s];
			String y = ("o");
			for(int x = 0; x<spooky.length - 1; x++){
				y = y + ("o");
			}
				System.out.println("Sp" + y + "ky");
			
			
			}
		}
	}


