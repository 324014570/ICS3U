package alKwiliy;

import java.util.Scanner;
/**
 * This program checks for 001, 002, 003, 004, 005, 006, 007, 008 or 009 in the message the user inputs and outputs the amount of times it appears 
 * @author Fayez Al-kwiliy, Tenzing Kelsang, Adam Seftel, Kaazim Patel, Yonis Nur
 *11/04/2017
 */
public class MissionBriefing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your message");
		String[]message = sc.nextLine().split("[.]");
		int x = 0;
		for(int i = 0; i<message.length; i++){

			if(message[i].equals("001") || message[i].equals("002") || message[i].equals("003")|| message[i].equals("004") || message[i].equals("005") || message[i].equals("006") || message[i].equals("007") || message[i].equals("008") || message[i].equals("009")){
				x = x + 1;

			}
		}
		System.out.print(x);

	}

}
