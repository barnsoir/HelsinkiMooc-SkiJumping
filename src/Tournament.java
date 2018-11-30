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

    public Tournament() {
       this.jumpers = new ArrayList<Jumper>();
    }
    
    public void addParticipant(Jumper jumper) {
        this.jumpers.add(jumper);
    }
}
