package Summative;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class AvoidBlack implements Behavior {
	private boolean suppressed = false;
	private LightSensor light = new LightSensor(SensorPort.S2);
	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		suppressed = true;

	}
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		if(light.getLightValue() < 25){
			return true;
		}
		return false;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		Motor.A.stop();
		Motor.B.stop();
				

		Motor.A.rotate(180);
		Motor.B.rotate(-180);

		Motor.A.forward();
		Motor.B.backward();


	}



}
