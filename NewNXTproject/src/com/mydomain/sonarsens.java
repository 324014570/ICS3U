package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class sonarsens {

	public static void main(String[] args) {
		UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S2);
		Motor.B.forward();
		Motor.C.forward();
		while (Motor.B.isMoving() || Motor.C.isMoving()){
			sonar.getDistance();
			if(sonar.getDistance() <= 25){
				Motor.B.backward();
				Motor.C.backward();	
			}
			else{
				Motor.B.forward();
				Motor.C.forward();
			}

			if(Button.ENTER.isDown()){
				Motor.B.stop();
				Motor.C.stop();
			}
		}
		
		
		

	}

}
