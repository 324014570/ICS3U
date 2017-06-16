package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCD.drawString("Program 1", 0, 0);
		Button.waitForAnyPress();
		Motor.B.forward();
		Motor.C.forward();
		LCD.drawString("FORWARD", 0, 1);
		Motor.B.backward();
		Motor.C.backward();
		Button.waitForAnyPress();
		Motor.B.backward();
		Motor.C.backward();
		LCD.drawString("BACKWARD", 0, 2);
		Button.waitForAnyPress();
		Motor.B.stop();
		Motor.C.stop();

	}

}
