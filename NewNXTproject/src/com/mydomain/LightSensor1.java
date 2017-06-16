package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class LightSensor1 implements Behavior {
	private boolean suppress = false;
	private LightSensor light = new LightSensor(SensorPort.S4);
	@Override
	public boolean takeControl() {
		light.getLightValue();
		return true;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
suppress = false;
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub

	}

}
