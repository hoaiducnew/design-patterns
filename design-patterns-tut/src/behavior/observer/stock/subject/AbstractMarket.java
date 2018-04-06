package behavior.observer.stock.subject;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMarket extends Subject {
    Map<String, Double> stocklist = new HashMap<>();

    public Map<String, Double> getStocklist() {
        return stocklist;
    }
}