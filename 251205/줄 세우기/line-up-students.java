import java.util.*;

class Student {
    int number;
    int height;
    int weight;

    public Student(int number, int height, int weight) {
        this.number = number;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];
        // 키가 큰 학생수, 동일하면 몸무게가 더큰쪽.
        for (int i = 0; i < n; i++) {
            int number = i + 1;
            int height = sc.nextInt();
            int weight = sc.nextInt();
            student[i] = new Student(number, height, weight);
        }
        Arrays.sort(student, (a, b) -> {
            if(a.height != b.height) {
                return b.height - a.height;
            } else {
                return b.weight - a.weight;
            }
        });

        for(Student s : student) {
            System.out.println(s.height + " " + s.weight + " " + s.number);
        }
    }
}