import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if(n == 0) return 0;
        
        int result = n % 10;

        return result * result + sum(n / 10);
    }
}