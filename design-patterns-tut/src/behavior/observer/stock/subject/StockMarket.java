package behavior.observer.stock.subject;

public class StockMarket extends AbstractMarket {
    public void addStock(String stockSymbol, Double price) {
        stocklist.put(stockSymbol, price);
        notifyObservers(stockSymbol, price);
    }

    public void update(String stockSymbol, Double price) {
        stocklist.put(stockSymbol, price);
        notifyObservers(stockSymbol, price);
    }
}