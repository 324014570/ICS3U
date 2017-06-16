package com.mydomain;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class isu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Behavior b0 = new EndProgram();
		Behavior b1 = new DriveForward();
		Behavior b2 = new HitObject();
		Behavior b3 = new SenseObject();
		Behavior b4 = new LightSensor1();
		Behavior b5 = new LightSensor2();
		Behavior [] behaviors = {b1, b2, b3, b4, b0};
		Arbitrator arby = new Arbitrator(behaviors);
		Button.waitForAnyPress();
		arby.start();
		Button.waitForAnyPress();

	}

}
