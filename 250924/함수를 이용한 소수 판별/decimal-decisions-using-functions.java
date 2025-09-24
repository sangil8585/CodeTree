import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = cal(a, b);
        System.out.print(cnt);
    }

    public static int cal(int l, int r) {
        int cnt = 0;
        for(int i = l; i <= r; i++) {
            if(isPrime(i)) {
                cnt += i;
            }
        }
        
        return cnt;
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}