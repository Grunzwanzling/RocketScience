/**
 * 
 */
package main;

import javax.swing.event.EventListenerList;

/**
 * @author Maximilian
 *
 */
public class Space {
	EventListenerList bulletListeners = new EventListenerList();

	public EventListenerList getBulletListeners() {
		return bulletListeners;
	}

	int width, height;

	/**
	 * 
	 */
	public Space(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void addBullet(UpdateListener listener) {
		bulletListeners.add(UpdateListener.class, listener);
	}

	public void removeBullet(UpdateListener listener) {
		bulletListeners.remove(UpdateListener.class, listener);
	}

	protected void updateBullets(int ms, Bullet listener) {
		for (int i = 0; i <= ms; i++) {
			listener.setX(listener.getX() + listener.getSpeedX());
			listener.setY(listener.getY() + listener.getSpeedY());
			if (listener.getX() <= 0)
				listener.setSpeedX(Math.abs(listener.getSpeedX()));
			if (listener.getSpeedY() <= 0)
				listener.setSpeedY(Math.abs(listener.getSpeedY()));

			if (listener.getX() >= width)
				listener.setSpeedX(-Math.abs(listener.getSpeedX()));
			if (listener.getSpeedY() >= height)
				listener.setSpeedY(-Math.abs(listener.getSpeedY()));

			Object[] listeners = this.bulletListeners.getListenerList();
			int numListeners = listeners.length;
			for (int e = 0; e < numListeners; e += 1) {
				if (listeners[i] == Bullet.class) {
					((Bullet) listeners[i + 1]).getSize();

					double x1 = ((Bullet) listener).getX();
					double x2 = ((Bullet) listeners[i + 1]).getX();
					double y1 = ((Bullet) listener).getY();
					double y2 = ((Bullet) listeners[i + 1]).getY();
					double minDistance = ((Bullet) listener).getSize()
							+ ((Bullet) listeners[i + 1]).getSize();

					double distance = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2)
							+ Math.pow(Math.abs(y1 - y2), 2));

					UpdateEvent ue = new UpdateEvent();
					ue.setHitBy((Bullet) listeners[i + 1]);

					if (distance <= minDistance) {
						((Bullet) listener).hitBy(ue);
						ue.setHitBy((Bullet) listener);
						((Bullet) listeners[i + 1]).hitBy(ue);
					}

				}
			}

		}
	}
}
