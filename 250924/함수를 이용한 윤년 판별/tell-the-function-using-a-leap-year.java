import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // 4로 나눠떨어지는해 윤년 2000, 2020, 2008 등..
        // 100으로 나눠 떨어지면 평년임 1900
        
        if(check(y)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    public static boolean check(int year) {
        return (year % 100 != 0 && year % 4 == 0) || (year % 400 == 0);
        
    }
}