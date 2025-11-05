import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        plus(a, b);
    }

    public static void plus(int a, int b) {
        int big = 0;
        int small = 0;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        int bigResult = big + 25;
        int smallResult = small * 2;

        System.out.print(smallResult + " " + bigResult);
    }
}