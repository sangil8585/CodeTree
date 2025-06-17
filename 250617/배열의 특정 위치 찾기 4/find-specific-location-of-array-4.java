import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] += sc.nextInt();
            if(arr[i] % 0) {
                sum += arr[i];
                count++;
            }
            
        }
        System.out.print(count+" "+sum);
    }
}