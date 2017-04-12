package alKwiliy;

import java.util.Scanner;
/**
 * This program checks who is superior, batman or superman 
 * @author Fayez Al-kwiliy, Tenzing Kelsang, Adam Seftel, Kaazim Patel, Yonis Nur
 *11/04/2017
 */
public class BattlePredictions {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		System.out.println("print out batmans attack and defense(seperated by a space) then hit enter and print out supermans attack and defense(seperated by a space)");
		int batmanAttack = sc.nextInt();
		int batmanDefence = sc.nextInt();
		int supermanAttack = sc.nextInt();
		int supermanDefence = sc.nextInt();
		if (supermanAttack<=100 && supermanAttack>=0 && supermanDefence<=100 && supermanDefence>=0 && batmanDefence<=100 && batmanDefence>=0  && batmanAttack<=100 && batmanAttack>=0){


			int a = batmanAttack + batmanDefence;
			int b = supermanAttack + supermanDefence;
			if (a == b||a-b < 5 && b-a < 5){	
				System.out.println("Inconclusive");
			}
			else{
				if(a>b){
					System.out.println("batman");
				}
				else if (b>a){
					System.out.println("superman");
				}

			}
		}

	}

}

