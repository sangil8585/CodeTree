import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == M) {
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}