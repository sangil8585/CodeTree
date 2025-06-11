import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            count++;
        }
        
        double avg = (count == 0) ? 0 : (double) sum / count;
        System.out.printf("%d %.1f\n", sum, avg);
    }
}