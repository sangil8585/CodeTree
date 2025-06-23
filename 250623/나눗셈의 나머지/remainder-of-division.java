import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] remainderCount = new int[B];

        while (A > 0) {
            int remainder = A % B;
            remainderCount[remainder]++;
            A = A / B;
        }

        int sum = 0;
        for (int count : remainderCount) {
            sum += count * count;
        }

        System.out.println(sum);
    }
}