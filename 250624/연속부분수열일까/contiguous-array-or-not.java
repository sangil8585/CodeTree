import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int[] A = new int[N1];
        int[] B = new int[N2];

        for(int i = 0; i < N1; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N2; i++) {
            B[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i = 0; i <= N1-N2; i++) {   
            boolean match = true;
            for(int j = 0; j < N2; j++) {
                if (A[i + j] != B[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}