import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(add(n));
    }

    public static int add(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        return add(n/3) + add(n-1);
        
        // n번째 수는 n/3 수와 n-1 번째 수의 합으로 나열된 수열
        // 3 = 3/3 + (3-1) 
    }
}