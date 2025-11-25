import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factory(n));
    }

    public static int factory(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factory(n-1);
    }
}