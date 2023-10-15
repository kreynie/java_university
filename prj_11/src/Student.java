import java.util.Arrays;

public class Student {
    private int iDNumber;
    private double gpa;

    public Student(int iDNumber, double gpa) {
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return gpa;
    }

    public static void insertionSortByIDNumber(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", GPA=" + gpa +
                '}';
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student[] students = {
            new Student(3, 3.5),
            new Student(1, 4.0),
            new Student(2, 3.0),
            new Student(4, 3.7)
        };

        System.out.println("Before sorting by IDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }

        Student.insertionSortByIDNumber(students);

        System.out.println("\nAfter sorting by IDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
