import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        Map<Integer, Integer> remainderCount = new HashMap<>();
        
        while (A > 0) {
            int remainder = A % B;  // 나머지 계산
            
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
            
            A = A / B;
        }
        
        int result = 0;
        for (int count : remainderCount.values()) {
            result += count * count;
        }
        
        System.out.println(result);
        
        sc.close();
    }
}