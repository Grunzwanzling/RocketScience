/**
 * 
 */
package main;

import java.awt.Color;

/**
 * @author Maximilian
 *
 */
public class Ship implements UpdateListener {

	double x, y;
	Color color;
	double speedX, speedY;
	double health;

	public Ship(double x, double y, double speedX, double speedY, Color color,
			double health) {
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.color = color;

	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
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

	@Override
	public void hitBy(UpdateEvent ue) {
		// TODO Auto-generated method stub

	}

}
