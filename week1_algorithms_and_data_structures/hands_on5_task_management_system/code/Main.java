public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        tm.addTask(new Task(1, "Design UI", "Pending"));
        tm.addTask(new Task(2, "Setup database", "In Progress"));
        tm.addTask(new Task(3, "Write API", "Pending"));

        System.out.println("All Tasks:");
        tm.displayTasks();

        System.out.println("\nSearch for Task ID 2:");
        System.out.println(tm.searchTask(2));

        System.out.println("\nDeleting Task ID 2:");
        tm.deleteTask(2);

        System.out.println("\nTasks After Deletion:");
        tm.displayTasks();
    }
}
