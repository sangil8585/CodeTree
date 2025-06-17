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
        double roundedAvg = Math.round(avg * 10) / 10.0;
        String result;

        if (roundedAvg >= 4.0) {
            result = "Perfect";
        } else if (roundedAvg >= 3.0) {
            result = "Good";
        } else {
            result = "Poor";
        }

        System.out.printf("%.1f\n", roundedAvg);
        System.out.println(result);
    }
}