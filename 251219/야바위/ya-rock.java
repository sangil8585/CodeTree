import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (ball == a) {
                ball = b;
            } else if (ball == b) {
                ball = a;
            }
        }
        
        System.out.println(ball);
        sc.close();
    }
}