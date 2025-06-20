import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[B];
        int sum = 0;

        while(A>0) {
            int num = A % B;
            arr[num]++;

            A = A / B;
            if(A == 0) {
                break;
            }
        }

        for(int i = 0; i < B; i++) {
            sum += arr[i] * arr[i];
        }

        System.out.print(sum);
    }
}