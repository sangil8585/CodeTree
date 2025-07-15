import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int cnt = 1;
        
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < arr[i].length(); j++) {
                System.out.print(arr[i].charAt(j));
                cnt++;

                if(cnt == 6) {
                    System.out.println();
                    cnt = 1;
                }
            }
        }
    }
}