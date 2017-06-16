package com.mydomain;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class SenseObject implements Behavior {
	UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S2);
	private boolean suppress=false;
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		suppress = false;
		}
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub

	}

}
