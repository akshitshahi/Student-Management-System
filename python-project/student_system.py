# student_system.py

# Placeholder code for Student Management System
class Student:
    def __init__(self, name, roll_no, age):
        self.name = name
        self.roll_no = roll_no
        self.age = age

    def __str__(self):
        return f"Name: {self.name}, Roll No: {self.roll_no}, Age: {self.age}"

class StudentSystem:
    def __init__(self):
        self.students = {}

    def add_student(self, name, roll_no, age):
        if roll_no in self.students:
            print(f"Student with roll number {roll_no} already exists.")
        else:
            self.students[roll_no] = Student(name, roll_no, age)
            print(f"Student {name} added successfully.")

    def update_student(self, roll_no, name=None, age=None):
        if roll_no in self.students:
            student = self.students[roll_no]
            if name:
                student.name = name
            if age:
                student.age = age
            print(f"Student with roll number {roll_no} updated.")
        else:
            print(f"No student found with roll number {roll_no}.")

    def delete_student(self, roll_no):
        if roll_no in self.students:
            del self.students[roll_no]
            print(f"Student with roll number {roll_no} deleted.")
        else:
            print(f"No student found with roll number {roll_no}.")

    def display_students(self):
        if not self.students:
            print("No students available.")
        else:
            print("List of students:")
            for student in self.students.values():
                print(student)

# Placeholder main function
def main():
    print("Welcome to the Student Management System!")
    system = StudentSystem()
    system.add_student("Alice", 101, 20)
    system.add_student("Bob", 102, 22)
    system.update_student(101, age=21)
    system.display_students()
    system.delete_student(102)
    system.display_students()

if __name__ == "__main__":
    main()
