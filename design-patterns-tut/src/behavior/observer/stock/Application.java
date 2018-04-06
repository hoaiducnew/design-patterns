package behavior.observer.stock;

import behavior.observer.stock.observer.StockBuyer;
import behavior.observer.stock.observer.StockViewer;
import behavior.observer.stock.subject.StockMarket;

public class Application {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        StockBuyer buyer = new StockBuyer();
        StockViewer viewer = new StockViewer();
        market.addStock("ORC", 12.23);
        market.addStock("MSC", 45.78);
        market.update("ORC", 12.34);
        market.update("MSC", 44.68);
    }
}