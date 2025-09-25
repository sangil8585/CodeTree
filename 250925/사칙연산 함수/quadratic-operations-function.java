import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        int sum = 0;

        switch(o) {
            case '+' :
                sum = plus(a, c);
                break;
            case '-' :
                sum = min(a, c);
                break;
            case '*' :
                sum = gop(a, c);
                break;
            case '/' :
                sum = nanu(a, c);
                break;
            default:
                System.out.print("False");
                return;
        }
        System.out.print(a + " " + o + " " + c + " = " + sum);
    }

    public static int plus(int x, int y) {
        return x + y;
    }
    public static int min(int x, int y) {
        return x - y;
    }
    public static int gop(int x, int y) {
        return x * y;
    }
    public static int nanu(int x, int y) {
        return x / y;
    }
}