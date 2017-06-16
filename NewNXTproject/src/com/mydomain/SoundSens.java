package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;

public class SoundSens {

	public static void main(String[] args) {
		LCD.drawString("TouchSensor", 0, 0);
		SoundSensor sound = new SoundSensor(SensorPort.S1);
		Motor.B.backward();
		Motor.C.backward();
		while (Motor.B.isMoving() || Motor.C.isMoving()){
			while (sound.readValue()>50){
				Motor.B.forward();
				Motor.C.forward();
			}
		}
		
		Button.waitForAnyPress(); 

	}

}
 