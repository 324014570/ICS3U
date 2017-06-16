package Summative;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior {
	private boolean supressed = false;
	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		supressed = true;

	}



public boolean takeControl() {
	// TODO Auto-generated method stub
	if(Button.ESCAPE.isDown()){
		return true;
	}
	return false;
}

@Override
public void action() {
	// TODO Auto-generated method stub
	Motor.A.stop();
	Motor.B.stop();
}



}
