package behavior.observer.stock.observer;

public interface Observer {
	void update(String stockSymbol, Double price);
}