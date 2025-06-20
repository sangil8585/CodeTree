import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] cnt = new int[7];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
        }

        for(int i = 1; i < 7; i++) {
            System.out.println(i + " - " + cnt[i]);
        }
    }
}