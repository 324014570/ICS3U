package com.mydomain;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class EndProgram implements Behavior {

	@Override
	public boolean takeControl() {
	return Button.ESCAPE.isDown();
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
