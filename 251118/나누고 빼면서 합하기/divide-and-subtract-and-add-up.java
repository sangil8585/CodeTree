import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();      // 예: 5
        int m = sc.nextInt();  // 예: 4

        arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();   // arr[i] = {5, 4, 3, 2, 1}
        }

        int answer = calcul(m);
        System.out.println(answer);
    }

    public static int calcul(int m) {
        int sum = 0;

        while (m > 0) {
            sum += arr[m];

            if (m % 2 == 0) {
                m /= 2;
            } else {
                m -= 1;
            }
        }

        return sum;
    }
}
