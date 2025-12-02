import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // 1. ap로 시작하는 단어만 사전 순 정렬
        Arrays.sort(words);        
        for (int i = 0; i < n; i++) {
            if(words[i].contains("ap")) {
                System.out.println(words[k]);
                break;
            }
        }
        
        
    }
}