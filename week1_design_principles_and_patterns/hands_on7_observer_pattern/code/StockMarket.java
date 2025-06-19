import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }

    public void setPrice(double newPrice) {
        System.out.println("Stock price updated to: ₹" + newPrice);
        this.price = newPrice;
        notifyObservers();
    }
}

