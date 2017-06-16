package com.mydomain;

import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;

public class LightSense {

	public static void main(String[] args) {
	LightSensor light = new LightSensor(SensorPort.S4);
	LCD.drawString("TouchSensor", 0, 0);
	Motor.B.forward();
	Motor.C.forward();
	while()
	light.getLightValue();
	
		

	}

}
