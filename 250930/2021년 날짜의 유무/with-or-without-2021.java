import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isTrue(m, d)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isTrue(int mm, int dd) {
        if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            return dd <= 31;
        } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
            return dd <= 30;
        } else if (mm == 2) {
            return dd <= 28;
        }
        
        return false;
    }
}