import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String alpa = sc.next();
        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == alpa.charAt(0)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}