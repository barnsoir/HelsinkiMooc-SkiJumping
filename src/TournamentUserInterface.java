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

public class TournamentUserInterface {

        Scanner reader = new Scanner(System.in);
        private Tournament tournament;

        public void start(Tournament tournament) {

            this.tournament = tournament;
            System.out.println("Kumpula ski jumping week");
            System.out.println();
            enterParticipants();
            enterRounds();
            displayResults();
        }

        public void enterParticipants() {

            System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

            while (true) {
                String input = getParticipant();

                if (!input.equals("")) {
                    tournament.addParticipant(new Jumper(input));
                } else {
                    System.out.println("The tournament begins!");
                    break;
                }
            }
        }

        public String getParticipant() {
            System.out.print("Participant name: ");
            return this.reader.nextLine();
        }

        public void enterRounds() {
            while(true) {
                String input = getRound();

                if (input.equals("jump")) {
                    tournament.setRounds(tournament.getRounds()+1);
                    Round round = new Round(tournament, tournament.getRounds());
                    round.printStandings();
                    round.runRound();
                    tournament.addRound(round.getRoundNumber(), round);
                } else {
                    System.out.println("Thanks!");
                    System.out.println();
                    break;
                }
            }
        }

        public String getRound() {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");

            return this.reader.nextLine();
        }

        public void displayResults() {
            System.out.println("Tournament results:");
            System.out.println("Position    Name");
            ArrayList<Jumper> standings = tournament.standings();
            Collections.reverse(standings);
            for (int i=0; i<standings.size(); i++) {
                Jumper jumper = standings.get(i);
                System.out.println((i+1) + "           " + jumper.getName() + " (" + jumper.getScore() + " points)");
                System.out.print("            Jump lengths: ");
                tournament.printJumps(jumper.getName());
            }


        }
}
