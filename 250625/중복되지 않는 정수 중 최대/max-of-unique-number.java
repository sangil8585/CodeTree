import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] count = new int[1001];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 1000; i++) {
            if (count[i] == 1) {
                if (i > max) {
                    max = i;
                }
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }
}