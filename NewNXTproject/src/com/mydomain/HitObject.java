package com.mydomain;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class HitObject implements Behavior {
private boolean suppress = false;
	@Override
	public boolean takeControl() {
		if(LightSensor1.getvalue() > ){
		return true;
		}
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		suppress = false;
		/*Motor.A.forward();
		while(!suppress){
			Thread.yield();
		}
		Motor.A.stop();
		Motor.A.stop();*/
		Motor.A.rotate(720, true);
		
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
