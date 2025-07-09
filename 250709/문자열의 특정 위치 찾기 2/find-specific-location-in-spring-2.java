import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        String a = sc.next();
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(2) == a.charAt(0)) {
                System.out.println(arr[i]);
                cnt++;
            } else if (arr[i].charAt(3) == a.charAt(0)) {
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}