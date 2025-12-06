import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            arr[i][0] = v;
            arr[i][1] = i;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) return a[0] - b[0];
                return a[1] - b[1];
            }
        });

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int originalIndex = arr[i][1];
            answer[originalIndex] = i + 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(answer[i]);
            if (i + 1 < n) sb.append(" ");
        }
        System.out.println(sb);
    }
}