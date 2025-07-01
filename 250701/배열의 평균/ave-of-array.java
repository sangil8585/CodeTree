import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        double[] rowAvg = new double[2];
        double[] colAvg = new double[4];
        double totalSum = 0;
        
        for(int i = 0; i < 2; i++) {
            double rowSum = 0;
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt(); 
                rowSum += arr[i][j]; // 총합
                colAvg[j] += arr[i][j]; // 세로 평균
                totalSum += arr[i][j];
            }
            rowAvg[i] = rowSum / 4; // 가로 평균
        }

        for(double avg : rowAvg) {
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        for(double avg : colAvg) {
            System.out.printf("%.1f ", avg/2);
        }
        System.out.println();

        System.out.printf("%.1f ", totalSum/8);
    }
}