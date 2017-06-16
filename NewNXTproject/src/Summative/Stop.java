package Summative;
/**
 * Stop.java
 * Ends the program
 * 15/06/2017
 * @author Fayez Al-kwiliy
 */

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior {
	/**
	 * no suppress
	 */
	@Override
	public void suppress() {
		// TODO Auto-generated method stub

	}
	/**
	 * takes control if the button is pressed
	 */
	public boolean takeControl() {
		// TODO Auto-generated method stub
		if (Button.ESCAPE.isDown()) {
			return true;
		}
		return false;
	}
	/**
	 *Robot stops moving  
	 */
	@Override
	public void action() {
		// TODO Auto-generated method stub
		Motor.A.stop();
		Motor.B.stop();
	}

}
