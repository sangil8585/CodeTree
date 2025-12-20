import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int minDiff = Integer.MAX_VALUE;

        for (int num = 0; num < n; num++) {
            arr[num] *= 2;

            for (int remain = 0; remain < n; remain++) {
                int[] remainArr = new int[n - 1];
                int cnt = 0;

                for (int i = 0; i < n; i++) {
                    if (i != remain) remainArr[cnt++] = arr[i];
                }

                int sumDiff = 0;
                for (int j = 0; j < n - 2; j++) {
                    sumDiff += Math.abs(remainArr[j + 1] - remainArr[j]);
                }

                minDiff = Math.min(minDiff, sumDiff);
            }

            arr[num] /= 2;
        }

        System.out.println(minDiff);
    }
}