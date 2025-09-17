import java.util.Scanner;

public class Main {
    public static void loopFor(int len) {
        for(int i = 0; i < len; i++) {
            System.out.print("12345^&*()_");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        loopFor(n);
    }
}