package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class LightSensor2 implements Behavior {
	private boolean suppress = false;
	private LightSensor lightT = new LightSensor(SensorPort.S2);
	@Override                                                                                                                     
	public boolean takeControl() {
		lightT.getLightValue();
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
