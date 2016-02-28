/**
 * 
 */
package main;

import java.awt.Color;

/**
 * @author Maximilian
 *
 */
public class Bullet implements UpdateListener {

	double x, y;
	Color color;
	double speedX, speedY;
	int bouncesLeft, timeLeft;
	boolean willExplode;
	boolean tracker;

	public Bullet(double x, double y, double speedX, double speedY,
			Color color, int bouncesLeft, int timeLeft, boolean willExplode,
			boolean tracker) {
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.color = color;
		this.bouncesLeft = bouncesLeft;
		this.timeLeft = timeLeft;
	}

	@Override
	public void update(UpdateEvent ue) {
		// TODO Auto-generated method stub

	}

}
