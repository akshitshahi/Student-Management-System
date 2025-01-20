// StudentSystem.java

// Placeholder code for Student Management System
import java.util.HashMap;
import java.util.Map;

public class StudentSystem {

    static class Student {
        String name;
        int rollNo;
        int age;

        public Student(String name, int rollNo, int age) {
            this.name = name;
            this.rollNo = rollNo;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age;
        }
    }

    static class StudentSystemManager {
        Map<Integer, Student> students = new HashMap<>();

        public void addStudent(String name, int rollNo, int age) {
            if (students.containsKey(rollNo)) {
                System.out.println("Student with roll number " + rollNo + " already exists.");
            } else {
                students.put(rollNo, new Student(name, rollNo, age));
                System.out.println("Student " + name + " added successfully.");
            }
        }

        public void updateStudent(int rollNo, String name, Integer age) {
            if (students.containsKey(rollNo)) {
                Student student = students.get(rollNo);
                if (name != null) {
                    student.name = name;
                }
                if (age != null) {
                    student.age = age;
                }
                System.out.println("Student with roll number " + rollNo + " updated.");
            } else {
                System.out.println("No student found with roll number " + rollNo);
            }
        }

        public void deleteStudent(int rollNo) {
            if (students.containsKey(rollNo)) {
                students.remove(rollNo);
                System.out.println("Student with roll number " + rollNo + " deleted.");
            } else {
                System.out.println("No student found with roll number " + rollNo);
            }
        }

        public void displayStudents() {
            if (students.isEmpty()) {
                System.out.println("No students available.");
            } else {
                System.out.println("List of students:");
                for (Student student : students.values()) {
                    System.out.println(student);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System!");
        StudentSystemManager system = new StudentSystemManager();
        system.addStudent("Alice", 101, 20);
        system.addStudent("Bob", 102, 22);
        system.updateStudent(101, null, 21);
        system.displayStudents();
        system.deleteStudent(102);
        system.displayStudents();
    }
}
