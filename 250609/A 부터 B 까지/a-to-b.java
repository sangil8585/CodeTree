import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = A; i <= B; ) {
            System.out.print(i + " ");

            if (i % 2 == 1) { 
                i *= 2;
            } else { 
                i += 3;
            }
        }
    }
}