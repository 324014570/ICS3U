package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class Program5 {

	public static void main(String[] args) {
		LCD.drawString("Program 5", 0, 0);
		Motor.C.setSpeed(720);
		Motor.B.setSpeed(720);
		Motor.A.setSpeed(720);
		Motor.B.rotate(720,true);
		Motor.C.rotate(720,true);
		Motor.A.rotate(720,true);
		int i = 1;

		while(i<10){
			LCD.drawString(Motor.C.getTachoCount()+ " " +Motor.B.getTachoCount()+ " " +Motor.A.getTachoCount(), 0, i);
			Delay.msDelay(200);
			i = i + 1;
		}
		Button.waitForAnyPress();
	}

	

}
