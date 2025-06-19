public class Main {
    public static void main(String[] args) {

        // Basic configuration
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Computer Configuration:");
        basicComputer.showSpecs();

        System.out.println("\n-----------------------\n");

        // High-end configuration
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setKeyboard("Mechanical RGB")
                .build();

        System.out.println("Gaming Computer Configuration:");
        gamingComputer.showSpecs();
    }
}
