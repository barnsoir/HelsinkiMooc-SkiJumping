/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barne
 */
public class Jumper implements Comparable<Jumper> {
    
    private String name;
    private int score;
    
    public Jumper(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName () {
        return this.name;
    }

    public int getScore () {
        return this.score;
    }
    
/*    public void addRoundScore (int roundScore) {
        this.score += roundScore;
    } */

    public void setScore(int score) {
        this.score = score;
    }

    public int compareTo(Jumper jumper) {
        if (this.score == jumper.getScore()) {
            return 0;
        } else if (this.score > jumper.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }
}
