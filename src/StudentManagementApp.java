import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        boolean running = true;
        while (running) {
            System.out.println("----- Student Management System -----");
            System.out.println("1. Add a Student");
            System.out.println("2. Delete a Student");
            System.out.println("3. Update a Student's Information");
            System.out.println("4. Display all Students");
            System.out.println("5. Find a Student");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    Student student = new Student(id, firstName, lastName, age, course);
                    studentManager.addStudent(student);
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    String deleteId = scanner.nextLine();
                    studentManager.deleteStudent(deleteId);
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New First Name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String newLastName = scanner.nextLine();
            }
        }
    }
}
