import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.print(pailndrome(input)? "Yes" : "No");
    }

    public static boolean pailndrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str = sb.toString();
        
        return str.equals(s);
    }
}