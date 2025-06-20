public class Main {
    public static void main(String[] args) {
        

        // Reinitialize and use Quick Sort
        Order[] orders2 = {
            new Order(1, "Alice", 200.50),
            new Order(2, "Bob", 99.99),
            new Order(3, "Charlie", 150.75)
        };

        OrderSorter.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("Sorted by Quick Sort:");
        for (Order o : orders2) System.out.println(o);
    }
}
