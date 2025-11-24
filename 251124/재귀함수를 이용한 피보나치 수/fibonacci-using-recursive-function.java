import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 두항의 합이 그다음의 항이 되는 수열
        // 1,1,2,3,5,8,13,21,34,55,89,144

        System.out.print(fibo(n));
    }

    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}