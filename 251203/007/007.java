import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        
        Meeting meeting = new Meeting(sCode, mPoint, time);
        System.out.println("secret code : " + meeting.sCode);
        System.out.println("meeting point : " + meeting.mPoint);
        System.out.println("time : " + meeting.time);
    }
}

class Meeting {
    String sCode;
    char mPoint;
    int time;

    public Meeting(String sCode, char mPoint, int time) {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}