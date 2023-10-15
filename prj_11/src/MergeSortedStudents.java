import java.util.Arrays;

public class MergeSortedStudents {
    public static Student[] mergeSortedStudents(Student[] students1, Student[] students2) {
        int n1 = students1.length;
        int n2 = students2.length;
        Student[] merged = new Student[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (students1[i].getIDNumber() < students2[j].getIDNumber()) {
                merged[k] = students1[i];
                i++;
            } else {
                merged[k] = students2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            merged[k] = students1[i];
            i++;
            k++;
        }

        while (j < n2) {
            merged[k] = students2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {
        Student[] students1 = {
            new Student(1, 3.5),
            new Student(3, 4.0)
        };

        Student[] students2 = {
            new Student(2, 3.0),
            new Student(4, 3.7)
        };

        Arrays.sort(students1, new SortingStudentsByGPA());
        Arrays.sort(students2, new SortingStudentsByGPA());

        Student[] mergedStudents = mergeSortedStudents(students1, students2);

        System.out.println("Merged and sorted students by IDNumber:");
        for (Student student : mergedStudents) {
            System.out.println(student);
        }
    }
}
