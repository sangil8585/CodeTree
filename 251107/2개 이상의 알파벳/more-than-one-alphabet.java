import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.print(check(A)?"Yes":"No");
    }

    public static boolean check(String A) {
        
        char first = A.charAt(0);

        for (int i = 1; i < A.length(); i++) {
            if (A.charAt(i) != first) {
                return true;
            }
        }
        return false;
    }

    
}