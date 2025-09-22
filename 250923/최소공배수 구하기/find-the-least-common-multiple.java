import java.util.Scanner;

public class Main {
    public static int f(int a, int b) {
        int maxNum = Math.max(a, b);

        while(true) {
            if(maxNum % a == 0 && maxNum % b == 0) {
                return maxNum;
            }
            maxNum++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(f(n, m));
    }
}