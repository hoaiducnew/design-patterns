package behavior.observer.weather.subject;

import behavior.observer.weather.observer.Observer;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
