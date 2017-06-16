package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class program4 {

	public static void main(String[] args){
		LCD.drawString("Program 4", 0, 0);
		Motor.B.rotate(-1440,true);
		Motor.C.rotate(-1440,true);

		while(Motor.B.isMoving()||Motor.C.isMoving()){
			System.out.println(Motor.B.getTachoCount());
			System.out.println(Motor.C.getTachoCount());	


			if(Button.ENTER.isDown()){
				Motor.B.stop();

				Motor.C.stop();
				System.out.println(Motor.B.getTachoCount());
				System.out.println(Motor.C.getTachoCount());

			}
		}
	}
}
