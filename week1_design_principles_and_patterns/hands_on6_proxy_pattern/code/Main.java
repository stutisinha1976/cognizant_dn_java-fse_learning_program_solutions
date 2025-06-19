public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");

        System.out.println("\nFirst call (image will be loaded):");
        img1.display();

        System.out.println("\nSecond call (should use cache):");
        img1.display();

        System.out.println("\n\nNew proxy for another image:");
        Image img2 = new ProxyImage("vacation.png");

        img2.display();
    }
}
