import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        Map<String, Integer> visited = new HashMap<>();
        int currentPos = 0;
        
        for (int i = 0; i < N; i++) {
            String[] command = sc.nextLine().split(" ");
            int x = Integer.parseInt(command[0]);
            String direction = command[1];
            
            int nextPos;
            if (direction.equals("R")) {
                nextPos = currentPos + x;
                for (int pos = currentPos; pos < nextPos; pos++) {
                    String segment = pos + "-" + (pos + 1);
                    visited.put(segment, visited.getOrDefault(segment, 0) + 1);
                }
            } else { 
                nextPos = currentPos - x;
                for (int pos = nextPos; pos < currentPos; pos++) {
                    String segment = pos + "-" + (pos + 1);
                    visited.put(segment, visited.getOrDefault(segment, 0) + 1);
                }
            }
            
            currentPos = nextPos;
        }
        
        int count = 0;
        for (int visitCount : visited.values()) {
            if (visitCount >= 2) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}