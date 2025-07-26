import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();

        char first = arr[0];
        char second = arr[1];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == first) {
                arr[i] = '*';
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == second) {
                arr[i] = first;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '*') {
                arr[i] = second;
            }
        }

        System.out.println(new String(arr));
    }
}