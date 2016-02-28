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
	EventListenerList updateListeners = new EventListenerList();
	int width, height;

	/**
	 * 
	 */
	public Space(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void addUpdateListener(UpdateListener listener) {
		updateListeners.add(UpdateListener.class, listener);
	}

	public void removeUpdateListener(UpdateListener listener) {
		updateListeners.remove(UpdateListener.class, listener);
	}

	protected void fireUpdate(UpdateEvent ue) {
		Object[] listeners = updateListeners.getListenerList();
		int numListeners = listeners.length;
		for (int i = 0; i < numListeners; i += 2) {
			if (listeners[i] == UpdateListener.class) {
				((UpdateListener) listeners[i + 1]).update(ue);
			}
		}
	}

}
