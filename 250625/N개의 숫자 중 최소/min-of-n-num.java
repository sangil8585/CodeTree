import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];

        int maxInt = Integer.MAX_VALUE;
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < maxInt) {
                maxInt = arr[i];
                cnt++;
            }
        }
        System.out.print(maxInt + " " + cnt);
    }
}