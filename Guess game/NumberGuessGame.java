import java.util.*;

public class NumberGuessGame {

    // Method to generate a random number between 1 and 100
    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    // Method to provide hints based on the user's guess
    public static String giveHint(int number, int guess) {
        if (guess > (number + 10) || guess < (number - 10)) {
            return "Cold";
        } else if (number == guess) {
            return "Right";
        } else {
            return "Hot";
        }
    }

    // Update the Method to run the guessing game
    public static void runGuess() {
        int secretNumber = getRandomNumber();
        int userGuess;
        String hint;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100: ");
        userGuess = scanner.nextInt();

        while(secretNumber!=userGuess){

        hint = giveHint(secretNumber, userGuess);

        if (hint.equals("Right")) {
            System.out.println("You guessed it Right!");
            break;
            
        } else {
            System.out.println(hint);
        }
        System.out.print("Enter a number between 1 and 100: ");
        userGuess = scanner.nextInt();
        }
        

        scanner.close();
    }

    public static void main(String[] args) {
        runGuess();
    }
}
