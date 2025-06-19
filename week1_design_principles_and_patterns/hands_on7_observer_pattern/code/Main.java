public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        stockMarket.register(mobileUser);
        stockMarket.register(webUser);

        stockMarket.setPrice(1050.75);
        System.out.println();

        stockMarket.setPrice(1100.20);
        System.out.println();

        // Deregister one observer
        stockMarket.deregister(mobileUser);
        stockMarket.setPrice(1125.00);
    }
}
