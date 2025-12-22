import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minSum = Integer.MAX_VALUE;        
        for(int house = 0; house < n; house++) {
            int diffSum = 0;

            for(int j = 0; j < n; j++) {
                diffSum += Math.abs(house - j) * a[j];
            }

            minSum = Math.min(minSum, diffSum);
        }
        System.out.println(minSum);
    }
}