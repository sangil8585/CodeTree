import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[8];
        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] += sc.nextDouble();
            sum += arr[i];
        }

        double avg = sum / arr.length;
        double avgRound = Math.round(avg * 10) / 10.0;

        System.out.print(avgRound);
    }
}