import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int idx = -1;
        char input = sc.next().charAt(0);

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                idx = i;
                break;
            }
        }
        System.out.print(idx != -1 ? idx : "None");
    }
}