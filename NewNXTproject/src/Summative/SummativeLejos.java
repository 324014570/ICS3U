package Summative;
/**
 * SummativeLejos.java
 * hits a bottle depending on if it has black tape on it or not
 * 15/06/2017
 * @author Fayez Al-kwiliy
 */
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class SummativeLejos {

	public static void main(String[] args) {
		Behavior b0 = new Stop();
		Behavior b1 = new FindAndApproachBottle();
		Behavior b2 = new AvoidBlack();
		Behavior []bz = {b1, b2,b0};
		Arbitrator a = new Arbitrator(bz);
		a.start();
	}

}
