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
	int bouncesLeft, timeLeft, size;
	boolean willExplode;
	boolean tracker;

	public Bullet(double x, double y, double speedX, double speedY,
			Color color, int bouncesLeft, int timeLeft, int size,
			boolean willExplode, boolean tracker) {
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.color = color;
		this.bouncesLeft = bouncesLeft;
		this.timeLeft = timeLeft;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getSpeedX() {
		return speedX;
	}

	public void setSpeedX(double speedX) {
		this.speedX = speedX;
	}

	public double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(double speedY) {
		this.speedY = speedY;
	}

	public int getBouncesLeft() {
		return bouncesLeft;
	}

	public void setBouncesLeft(int bouncesLeft) {
		this.bouncesLeft = bouncesLeft;
	}

	public int getTimeLeft() {
		return timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isWillExplode() {
		return willExplode;
	}

	public void setWillExplode(boolean willExplode) {
		this.willExplode = willExplode;
	}

	public boolean isTracker() {
		return tracker;
	}

	public void setTracker(boolean tracker) {
		this.tracker = tracker;
	}

	@Override
	public void hitBy(UpdateEvent ue) {
		// TODO Auto-generated method stub

	}

}
