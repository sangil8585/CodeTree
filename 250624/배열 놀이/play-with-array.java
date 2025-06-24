import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int Q = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++ ) {
            int type = sc.nextInt();

            if(type == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            } else if (type == 2) {
                int b = sc.nextInt();
                int idx = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[j] == b) {
                        idx = j + 1;
                        break;
                    }
                }
                System.out.println(idx);
            } else if (type == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                // s 원소부터 e원소까지 arr[s-1]~arr[e-1]
                for (int j = s-1; j <= e-1 ; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.print("\n");
            }

        }


    }
}