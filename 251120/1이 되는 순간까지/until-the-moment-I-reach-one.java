import java.util.Scanner;
public class Main {
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) return cnt;
        
        cnt++;
        if(n % 2 == 0) {
            sum(n/2);
        } else {
            sum(n/3);
        }

        return cnt;
    }
}