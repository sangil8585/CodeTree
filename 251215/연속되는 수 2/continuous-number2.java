import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i-1]) {
                cnt++;
            } else if(i > 0 && arr[i] != arr[i-1]) {
                max = cnt;
                // cnt = 0;
            }
        }
        System.out.println(max+1);
    }
}