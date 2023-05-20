import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String course;

    public Student(String id, String firstName, String lastName, int age, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + age +
                "\nCourse: " + course + "\n";
    }
}

class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void deleteStudent(String studentId) {
        boolean removed = false;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                students.remove(student);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void updateStudent(String studentId, String firstName, String lastName, int age, String course) {
        boolean updated = false;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCourse(course);
                updated = true;
                break;
            }
        }
        if (updated) {
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void findStudent(String studentId) {
        boolean found = false;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        boolean running = true;
        while (running) {
            System.out.println("----- Student Management System -----");
            System.out.println("1. Add a Student");
            System.out.println("2. Delete a Student");
        }
    }
}
