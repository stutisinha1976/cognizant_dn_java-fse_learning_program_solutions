public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(101, "Alice", "Manager", 80000));
        ems.addEmployee(new Employee(102, "Bob", "Engineer", 60000));
        ems.addEmployee(new Employee(103, "Charlie", "HR", 50000));

        System.out.println("\nAll Employees:");
        ems.displayAllEmployees();

        System.out.println("\nSearching for employee with ID 102:");
        System.out.println(ems.searchEmployee(102));

        System.out.println("\nDeleting employee with ID 102...");
        ems.deleteEmployee(102);

        System.out.println("\nEmployees after deletion:");
        ems.displayAllEmployees();
    }
}
