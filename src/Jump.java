import java.util.*;

public class Jump {

    private List<Integer> votes;
    private int length;

    public Jump() {
        this.length = generateLength();
        this.votes = new ArrayList<Integer>();
        generateVotes(5, votes);
    }

    public int generateLength() {
        return (int)(60 + Math.random()*60);
    }

    public void generateVotes(int number, List<Integer> votes) {
        for (int i=0; i<number; i++) {
            votes.add((int)(10 + Math.random()*10));
        }
    }

    public int calculateScore() {
        // need to add 3 middle votes
        return this.length;
    }

    public void printJump() {
        System.out.println("    length: " + this.length);
        System.out.print("    judge votes: [");
        for (int j=0; j<votes.size(); j++) {
            System.out.print(votes.get(j));
            if (j<(votes.size()-1)) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
