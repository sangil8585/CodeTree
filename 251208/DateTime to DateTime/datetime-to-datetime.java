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

        int elaspedTime = 0;
        while(true) {
            if(day == A && hour == B && min == C) {
                break;
            }

            if(day >= A && hour >= B && min > C) {
                System.out.print(-1);
            }

            elaspedTime++;
            min++;

            if(min == 60) {
                hour++;
                min = 0;
            }

            if(hour == 24) {
                day++;
                hour = 0;
            }
        }
        System.out.print(elaspedTime);
    }
}