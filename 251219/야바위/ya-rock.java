import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        
        int result = 0;


        for (int num = 1; num <= 3; num++) {
            int cup = num;
            int score = 0;

            for (int i = 0; i < n; i++) {
                if(cup == a[i]) {
                    cup = b[i];
                } else if(cup == b[i]) {
                    cup = a[i];
                }

                if(cup == c[i]) {
                    score++;
                }
            }
            result = Math.max(result, score);
        }
        System.out.println(result);
    }
}