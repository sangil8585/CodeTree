import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 원소 개수 "6"
        int m = sc.nextInt(); // m개 정수 두 쌍 "4"
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // "6 5 4 3 2 1"
        }

        int sum = 0;

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt(); // "1, 2, 3, 5"
            int a2 = sc.nextInt(); // "2, 4, 4, 6"

            sum = 0;

            for(int j = a1-1; j <= a2-1; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }

        

    }
}