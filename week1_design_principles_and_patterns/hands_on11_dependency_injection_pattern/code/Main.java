public class Main {
    public static void main(String[] args) {
        // Injecting the dependency via constructor
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.displayCustomer(101);
    }
}
