import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        boolean tf1 = false;
        boolean tf2 = false;

        for (int i = 0; i < n.length()-1; i++) {
            if(n.substring(i, i+2).equals("ab")) {
                tf1 = true;
            } 
            if(n.substring(i, i+2).equals("ee")) {
                tf2 = true;
            }
        }

        System.out.print(tf2 ? "Yes " : "No ");
        System.out.print(tf1 ? "Yes " : "No ");
    }
}