public class Main {
    public static void main(String[] args) {
        // Model
        Student student = new Student("Priya Sharma", "S1001", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        System.out.println("\n--- Updating Student Details ---\n");

        // Update data
        controller.setStudentName("Rohit Roy");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
