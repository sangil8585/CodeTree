import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] arr = new double[N];
        double sum = 0;
        
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double avg = sum / N;
        String result;

        if (avg > 3.0 && avg < 4.0) {
            result = "Good";
        } else if (avg < 3.0) {
            result = "Poor";
        } else {
            result = "Perfect";
        }
        System.out.printf("%.1f\n", avg);
        System.out.println(result);
    }
}