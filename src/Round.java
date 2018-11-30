import java.util.*;

public class Round {

    private ArrayList<Jump> jumps;
    private Tournament tournamentStanding;
    private ArrayList<Jumper> standings;

    public Round(Tournament tournament) {
        this.jumps = new ArrayList<Jump>();
        this.tournamentStanding = tournament;
        this.standings = tournamentStanding.standings();
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
        System.out.println("Results of round ");
        for (int j=0; j<this.standings.size(); j++) {
            Jumper jumper = this.standings.get(j);
            System.out.println("  " + jumper.getName());
            Jump jump = new Jump();
            jump.printJump();
            jumper.addRoundScore(jump.calculateScore());
        }
        System.out.println();
    }

}
