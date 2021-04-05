import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int PPoints = 0;
        int CPoints = 0;
        int GameNum = 0;

        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors."); // tells the user what to do


        while (GameNum <= 5) {
            double rand = Math.random() * 3; // get a random number between 0 and 1.99999999...
            int Random = (int) rand + 1; // turns the random number into an integer and adds one to its value, now the new number will be either 1, 2, or 3

            System.out.println("*******************************************");
            System.out.println("Wins: " + PPoints + " Losses: " + CPoints);
            System.out.println("Player Choice: ");
            Scanner Scan = new Scanner(System.in); // makes a scanner
            String Choice = (Scan.next()); // lets the user enter their choice, either r, p, or s

            if (Choice.equals("r")) { // if their choice is r than do the following
                if (Random == 1) {
                    System.out.println("Draw!");
                    System.out.println("Computer Choice: Rock   Player Choice: Rock");
                } else if (Random == 2) {
                    System.out.println("You Loose!");
                    System.out.println("Computer Choice: Paper   Player Choice: Rock");
                    CPoints += 1;
                } else {
                    System.out.println("You Win!");
                    System.out.println("Computer Choice: Scissors   Player Choice: Rock");
                    PPoints += 1;
                }

            } else if (Choice.equals("p")) { // if their choice is p than do the following
                if (Random == 1) {
                    System.out.println("You Win!");
                    System.out.println("Computer Choice: Rock   Player Choice: Paper");
                    PPoints += 1;
                } else if (Random == 2) {
                    System.out.println("Draw!");
                    System.out.println("Computer Choice: Paper   Player Choice: Paper");
                } else {
                    System.out.println("You Loose!");
                    System.out.println("Computer Choice: Scissors   Player Choice: Paper");
                    CPoints += 1;
                }
            } else if (Choice.equals("s")) { // if their choice is s than do the following
                if (Random == 1) {
                    System.out.println("You Loose!");
                    System.out.println("Computer Choice: Rock   Player Choice: Scissors");
                    CPoints += 1;
                } else if (Random == 2) {
                    System.out.println("You Win!");
                    System.out.println("Computer Choice: Paper   Player Choice: Scissors");
                    PPoints += 1;
                } else {
                    System.out.println("Draw!");
                    System.out.println("Computer Choice: Scissors   Player Choice: Scissors");
                }
            } else { // if they dont put r, p, or s, there will be an error
                System.out.println("Invalid selection please play again");
            }
            GameNum += 1;
        }
    }

}