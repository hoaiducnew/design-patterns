package behavior.observer.stock.observer;

import java.util.HashMap;
import java.util.Map;

public class StockViewer implements Observer {
    Map<String, Double> stocklist = new HashMap<>();

    public void update(String stockSymbol, Double price) {
        System.out.println("StockBuyer: stocklist is changed:");
        stocklist.put(stockSymbol, price);
    }
}