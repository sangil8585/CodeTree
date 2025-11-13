import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        
        if(isTrue(text, pattern) == -1) {
            System.out.println("-1");
        } else {
            System.out.println(isTrue(text, pattern));
        }

    }

    public static int isTrue(String a, String b) {
        int index = a.indexOf(b);

        return index;
    }
}