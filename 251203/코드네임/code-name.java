import java.util.Scanner;

class Agent {
    String codeName;
    int score;

    public Agent() {
        this.codeName = "";
        this.score = 0;
    }

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agent = new Agent[5];
        for(int i = 0; i < agent.length; i++) {
            String codeName = sc.next();
            int score = sc.nextInt();
            agent[i] = new Agent(codeName, score);
        }

        Agent minAgent = agent[0];
        for(int i = 1; i < agent.length; i++) {
            if(agent[i].score < minAgent.score) {
                minAgent = agent[i];
            }
        }
        
        System.out.print(minAgent.codeName + " " + minAgent.score);
    }
}
