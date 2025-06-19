public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Chair", "Furniture")
        };

     

        // Binary Search
        Product found2 = SearchAlgorithms.binarySearch(products, "Chair");
        System.out.println("Binary Search: " + (found2 != null ? found2 : "Product not found"));
    }
}
