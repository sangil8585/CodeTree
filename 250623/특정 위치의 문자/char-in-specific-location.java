import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char input = sc.next().charAt(0);

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                System.out.print(i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.print("None");
        }
    }
}