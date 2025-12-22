import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        long reuslt = 0;

        for (int start = 1; start <= N; start++) {
            int cur = start;
            long sum = 0;

            for (int t = 0; t < M; t++) {
                cur = arr[cur];
                sum += cur;
            }

            if (sum > reuslt) reuslt = sum;
        }

        System.out.println(reuslt);
    }
}