

//Imports for Scanner, Random
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("coin guessing game!");

        while(true) {
            int yourCoins = -1;

            while(yourCoins < 0 || yourCoins > 3) {

                System.out.println("how many coins do u wish to hold? pick from 0 (inclusive) to 3.");

                if (scanner.hasNextInt()) {
                    yourCoins = scanner.nextInt();
                } else {
                    scanner.next();
                }

            }

            int yourGuess = -1;

            while(yourGuess < yourCoins || yourGuess > yourCoins + 3) {

                System.out.println("how many coins do you think exist?");

                if (scanner.hasNextInt()) {
                    yourGuess = scanner.nextInt();
                } else {
                    scanner.next();
                }

            }

            int theirCoins = random.nextInt(4);
            int theirGuess = theirCoins + random.nextInt(7- theirCoins);

            int total = theirCoins + yourCoins;

            boolean theyWin = total == theirGuess;
            boolean youWin = total == yourGuess;

            System.out.printf("computer had %d coin(s) and guessed %d coin(s)\n", theirCoins, theirGuess);
            System.out.printf("while you had %d coin(s) and guessed %d coin(s), result is:\n", yourCoins, yourGuess);

            if(!theyWin && !youWin) {
                System.out.println("both are incorrect, try again!");
            } else if (theyWin && !youWin) {
                System.out.println("computer won!");
            } else if (!theyWin && youWin) {
                System.out.println("you won!");
            } else {
                System.out.println("you both won!");
            }

            System.out.println("play again? (y/n)");
            String a = scanner.next().toLowerCase();
            if(!a.equals("y")) {
                System.out.println("cya!");
                break;
            }
            System.out.println("next round!");

    } scanner.close();

    }
    
}