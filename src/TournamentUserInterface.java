/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barne
 */
import java.util.Scanner;

public class TournamentUserInterface {

        Scanner reader = new Scanner(System.in);

        public void start() {

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
                    // add participant
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
                    // new round
                } else {
                    System.out.println("Thanks!");
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
        }
}
