/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barne
 */
import java.util.*;

public class Tournament {
    
    private ArrayList<Jumper> jumpers;
    private Map<Integer, Round> rounds;
    private Tournament tournament;
    private int roundNo;

    public Tournament() {
       this.jumpers = new ArrayList<Jumper>();
       this.roundNo = 0;
       this.rounds = new HashMap<Integer, Round>();
    }
    
    public void addParticipant(Jumper jumper) {
        this.jumpers.add(jumper);
    }

    public ArrayList<Jumper> standings () {
        Collections.sort(this.jumpers);
        return this.jumpers;
    }

    public int getRounds() {
        return roundNo;
    }

    public void setRounds(int roundNo) {
        this.roundNo = roundNo;
    }

    public void addRound(int roundNo, Round round) {
        this.rounds.put(roundNo, round);
    }

    public void printJumps(String jumper) {
        for (int i = 1; i <this.roundNo+1; i++) {
            System.out.print(this.rounds.get(i).getNamedJump(jumper) + " m");
            if (i<this.roundNo) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
