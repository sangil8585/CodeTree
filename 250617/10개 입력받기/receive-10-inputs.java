import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] += sc.nextInt();
            sum += arr[i];
            if(arr[i] == 0) {
                break;
            }
            count++;
        }

        Double avg = sum / (double)count;
        Double avgRound = Math.round(avg * 10) / 10.0;
        System.out.print(sum +" " +avgRound);

    }
}