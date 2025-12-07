import java.util.*;

class Student {
    int id;
    int height;
    int weight;

    public Student(int id, int height, int weight) {
        this.id = id;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(i + 1, h, w);
        }

        Arrays.sort(students, (a, b) -> {
            if (a.height != b.height) {
                return a.height - b.height;
            }
            if (a.weight != b.weight) {
                return b.weight - a.weight;
            }
            return a.id - b.id;
        });

        for (Student s : students) {
            System.out.println(s.height + " " + s.weight + " " + s.id);
        }
    }
}