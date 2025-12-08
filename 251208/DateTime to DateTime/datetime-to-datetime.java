import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int day = 11;
        int hour = 11;
        int min = 11;

        int startDay = day * 24 * 60 + hour * 60 + min;
        int endDay = A * 24 * 60 + B * 60 + C;

        if(startDay > endDay) {
            System.out.print(-1);
            return;
        }

        System.out.print(endDay - startDay);
    }
}