import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[] tf = new boolean[n + 1];
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            tf[c] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            if (!tf[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}