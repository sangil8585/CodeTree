import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                if (i >= 3) {
                    sum = arr[i-1] + arr[i-2] + arr[i-3];
                    System.out.println(sum);
                } else {
                    System.out.println(0);
                }
                break;
            }
        }
    }
}