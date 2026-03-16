import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int num = 1;

        for (int d = 0; d < N + M - 1; d++) {
            for (int i = Math.max(0, d - M + 1); i <= Math.min(d, N - 1); i++) {
                arr[i][d - i] = num++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (j > 0) sb.append(" ");
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}