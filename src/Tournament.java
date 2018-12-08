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
    private Tournament tournament;
    private int rounds;

    public Tournament() {
       this.jumpers = new ArrayList<Jumper>();
       this.rounds = 0;
    }
    
    public void addParticipant(Jumper jumper) {
        this.jumpers.add(jumper);
    }

    public ArrayList<Jumper> standings () {
        Collections.sort(this.jumpers);
        return this.jumpers;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
