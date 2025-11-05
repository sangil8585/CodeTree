import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = calcu(a, b);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] calcu(int a, int b) {
        int add = 25;
        int mul = 2;

        int aResult = 0;
        int bResult = 0;

        if (a >= b) {
            aResult = a + add;
            bResult = b * mul;
        } else {
            aResult = a * mul;
            bResult = b + add;
        }

        return new int[]{aResult, bResult};
    }
}