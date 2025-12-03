import java.util.*;

class User implements Comparable<User> {
    String name;
    String address;
    String region;

    public User(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }

    @Override
    public int compareTo(User other) {
        return this.name.compareTo(other.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] user = new User[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            
            user[i] = new User(name, address, region);
        }
        Arrays.sort(user);
        System.out.println("name " + user[n-1].name);
        System.out.println("addr " + user[n-1].address);
        System.out.println("city " + user[n-1].region);
    }
}