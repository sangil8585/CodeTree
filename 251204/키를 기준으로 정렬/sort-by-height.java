import java.util.*;

class Member {
    String name;
    int height;
    int weight;

    public Member(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Member[] member = new Member[n];

        for(int i = 0; i < member.length; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            member[i] = new Member(name, height, weight);
        }
        
        Arrays.sort(member, (a, b) -> a.height - b.height);

        for(int i = 0; i < n; i++) {
            System.out.println(member[i].name + " " + member[i].height + " " + member[i].weight);
        }
    }
}