package Summative;

/**
 * AvoidBlack.java
 * Turns around if the bottle has black tape
 * 15/06/2017
 * @author Fayez Al-kwiliy
 */
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class AvoidBlack implements Behavior {
	private boolean suppressed = false;
	private LightSensor light = new LightSensor(SensorPort.S2);

	/**
	 * suppress is now true
	 */
	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		suppressed = true;

	}

	/**
	 * take control if the bottle has black tape on it
	 */
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		if (light.getLightValue() < 25) {
			return true;
		}
		return false;
	}

	/**
	 * robot turns around
	 */
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
