import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        int cnt = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
            cnt += arr[i].length();
        }
        System.out.print(cnt);
    }
}