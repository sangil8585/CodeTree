import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(!isTrue(y, m, d)) {
            System.out.print(-1);
        } else {
            System.out.print(getSeason(m));
        }
    }

    public static boolean isTrue(int y, int m, int d) {
        if(m < 1 || m > 13) {
            return false;
        }

        int[] endInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(isLeapYear(y)) {
            endInMonth[2] = 29;
        }

        return d >= 1 && d <= endInMonth[m];
    }

    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    public static String getSeason(int m) {
        if (m >= 3 && m <= 5) return "Spring";
        if (m >= 6 && m <= 8) return "Summer";
        if (m >= 9 && m <= 11) return "Fall";
        
        return "Winter";
    }
}