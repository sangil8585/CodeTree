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
        double total = 0;
        double avg = 0;
        
        for(int i = 0; i < n; i++) {
            total += arr[i].length();
            for(int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == word.charAt(0)) {
                    cnt++;
                }
            }
        }
        avg = total / n;
        int intpart = (int) avg;
        System.out.print(cnt + " ");
        System.out.printf("%.2f", (double) intpart);
    }
}