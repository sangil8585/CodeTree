import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 각 나머지의 등장 횟수를 저장할 Map
        Map<Integer, Integer> remainderCount = new HashMap<>();
        
        // A가 10 이하가 될 때까지 반복
        while (A > 10) {
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