import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num1(n);
    }

    public static void num1(int n) {
        if(n==0) return;
        
        System.out.print(n + " ");
        num1(n-1);
        System.out.print(n + " ");
    }
}