package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class UsingTachometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCD.drawString("Program 2", 0, 0);
		Motor.B.setSpeed(720);
		Motor.C.setSpeed(720);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(2000);
		LCD.drawInt(Motor.B.getTachoCount(), 0,  1);
		LCD.drawInt(Motor.C.getTachoCount(), 0,  2);
		Motor.B.stop();
		Motor.C.stop();
		LCD.drawInt(Motor.B.getTachoCount(), 0,  3);
		LCD.drawInt(Motor.C.getTachoCount(), 0,  4);
		while(!(Motor.B.getTachoCount() == 0 && Motor.C.getTachoCount() == 0)){
			Motor.B.backward();
			Motor.C.backward();
		}
			
			
			
		LCD.drawInt(Motor.B.getTachoCount(), 0,  5);
		LCD.drawInt(Motor.C.getTachoCount(), 0,  6);
		Motor.B.stop();
		Motor.C.stop();
		
			LCD.drawInt(Motor.B.getTachoCount(), 0,  7);
			LCD.drawInt(Motor.C.getTachoCount(), 0,  8);
			Button.waitForAnyPress();
		


	}

}
