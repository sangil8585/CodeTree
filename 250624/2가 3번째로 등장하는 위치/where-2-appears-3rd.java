import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 2) cnt++;
            if(cnt == 3) {
                System.out.print(i+1);
                break;
            }
        }
    }
}