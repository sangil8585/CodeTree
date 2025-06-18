import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if ( (i+1) % 2 == 0) {
                sum1 += arr[i];
            }
            if ( (i+1) % 3 == 0 ) {
                sum2 += arr[i];
            }
        }

        avg = sum2 / 3.0;
        
        System.out.printf("%d %.1f", sum1, avg);
        
    }
}