import java.util.Scanner;

public class Main {
    public static int cal(int x, int y) {
        int sum = 1;
        
        for(int i = 0; i < y; i++) {
            sum *= x;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(cal(a, b));
    }
}