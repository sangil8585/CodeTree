import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] count = new int[B];

        while (A != 0) {
            int remainder = A % B;
            count[remainder]++;
            A = A / B;
        }

        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += count[i] * count[i];
        }

        System.out.println(sum);
    }
}