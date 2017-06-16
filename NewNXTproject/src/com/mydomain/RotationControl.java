package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class RotationControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCD.drawString("Program 3", 0, 0);
		Button.waitForAnyPress();
		Motor.B.rotate(1440);
		Motor.C.rotate(1440);
		LCD.drawInt(Motor.B.getTachoCount(), 0,  1);
		LCD.drawInt(Motor.C.getTachoCount(), 0,  2);
		Motor.B.rotateTo(0);
		Motor.C.rotateTo(0);
		LCD.drawInt(Motor.B.getTachoCount(), 0,  3);
		LCD.drawInt(Motor.C.getTachoCount(), 0,  4);
		Button.waitForAnyPress();

	}

}
