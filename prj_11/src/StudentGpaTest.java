import java.util.Arrays;
import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сортируем по убыванию GPA
        return Double.compare(student2.getGPA(), student1.getGPA());
    }
}

public class StudentGpaTest {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, 3.5),
            new Student(2, 4.0),
            new Student(3, 3.0),
            new Student(4, 3.7)
        };

        System.out.println("Before sorting by GPA:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (descending order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
