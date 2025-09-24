import java.util.Scanner;
public class Main {
    public static boolean check(int a) {
        int fst = a / 10;
        int sec = a % 10;
        int total = fst + sec;

        return (a % 2 == 0 && total % 5 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}