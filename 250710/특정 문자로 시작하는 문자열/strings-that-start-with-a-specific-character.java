import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String word = sc.next();
        int cnt = 0;
        int total = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i].charAt(0) == word.charAt(0)) {
                cnt++;
                total += arr[i].length();
            }
        }
        double avg = (double) total / cnt;
        
        System.out.printf("%d %.2f", cnt, avg);
    }
}