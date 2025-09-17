import java.util.Scanner;

public class Main {
    public static void loop(int n, int m) {
        for(int i = 0; i < n; i++) {
            for(int y = 0; y < m; y++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        loop(rowNum, colNum);
    }
}