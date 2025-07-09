import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }
        String a = sc.next();
        boolean found = false;

        for(int i = 0; i < 10; i++) {
            if (arr[i].charAt(arr[i].length() -1) == a.charAt(0)) {
                System.out.println(arr[i]);
                found = true;
            }
        }

        if(!found) {
            System.out.println("None");
        }
    }
}