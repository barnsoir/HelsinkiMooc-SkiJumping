import java.util.*;

public class Round {

    private Map<String, Jump> jumps;
    private Tournament tournamentStanding;
    private ArrayList<Jumper> standings;
    private int roundNumber;

    public Round(Tournament tournament, int roundNumber) {
        this.jumps = new HashMap<String, Jump>();
        this.tournamentStanding = tournament;
        this.standings = tournamentStanding.standings();
        this.roundNumber = roundNumber;
    }

    public void printStandings() {
        System.out.println("Jumping order:");
        for (int i=0; i<this.standings.size(); i++) {
            Jumper jumper = this.standings.get(i);
            System.out.println("  " + (i+1) + ". " + jumper.getName() + " (" + jumper.getScore() + " points)");
        }
        System.out.println();
    }

    public void runRound() {
        System.out.println("Results of round " + roundNumber);
        for (int j=0; j<this.standings.size(); j++) {
            Jumper jumper = this.standings.get(j);
            System.out.println("  " + jumper.getName());
            Jump jump = new Jump();
            jump.printJump();
            jumper.setScore(jumper.getScore() + jump.calculateScore());
            jumps.put(jumper.getName(), jump);
        }
        System.out.println();
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public int getNamedJump(String jumper) {
        return this.jumps.get(jumper).getLength();
    }
}
