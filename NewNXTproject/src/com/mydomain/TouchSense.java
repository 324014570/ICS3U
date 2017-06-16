package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class TouchSense {

	public static void main(String[] args) {
		LCD.drawString("TouchSensor", 0, 0);
		TouchSensor touchSensor = new TouchSensor(SensorPort.S3);
		while(touchSensor.isPressed() == false){
			Motor.B.backward();
			Motor.C.backward();
		}

		Motor.B.forward();
		Motor.C.forward();

		Button.waitForAnyPress();
	}
}