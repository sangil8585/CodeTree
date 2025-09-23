import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c) {
        int maxMin = Math.min(a, Math.min(b, c));
        return maxMin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(min(a, b, c));
    }
}