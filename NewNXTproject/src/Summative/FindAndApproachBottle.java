package Summative;
/**
 * FindAndApproachBottle.java
 * Looks for a bottle in the field/area, hits it if it doesn't have black tape 
 * 15/06/2017
 * @author Fayez Al-kwiliy
 */
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class FindAndApproachBottle implements Behavior {
	private boolean suppressed = false;
	private UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S1);
	private LightSensor light = new LightSensor(SensorPort.S4);

	/**
	 * suppress is now true
	 */
	public void suppress() {
		// TODO Auto-generated method stub
		suppressed = true;

	}
	/**
	 * if the distance between the object and sensor is less than 75.3 then takes control
	 */
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		if(ultra.getDistance() < 75.3){
			return true;
		}
		return false;
	}
	/**
	 * if the object is within 17 cm of the ultrasonic sensor and it doesn't have black tape on it then it hits it
	 */
	@Override
	public void action() {
		// TODO Auto-generated method stub
		Motor.A.stop();
		Motor.B.stop();
		while(ultra.getDistance() > 17){
			Motor.A.forward();
			Motor.B.forward();
		}
		Motor.A.stop();
		Motor.B.stop();

		if(light.getLightValue() > 25){
			Motor.C.rotate(90);
			Motor.C.rotate(-90);
		}
		Motor.A.rotate(90);
		Motor.B.rotate(90);
		Motor.A.forward();
		Motor.B.backward();

	}



}
