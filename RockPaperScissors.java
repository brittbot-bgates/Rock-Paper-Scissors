import java.util.Scanner;

public class RockPaperScissors {

    // TODO: Create a method after the game over that offers the player to play again

    public static void playerVersusComputer() {

        // Randomly determine the computer's choice as a String
        int randomNumber = (int) (Math.random() * 3); // 0 to 2
        String computerChoice = "";

        switch (randomNumber) {
            case 0 -> computerChoice = "Rock";
            case 1 -> computerChoice = "Paper";
            case 2 -> computerChoice = "Scissors";
        }

        // Get the player's choice as a String and then compare it to the computer's choice
        Scanner scanner = new Scanner(System.in);
        String playerInput;
        String playerChoice = "";
        boolean gameOver = false;

        System.out.println("Enter your choice here: ");

        while (!gameOver) {
            try {
                playerInput = scanner.nextLine();
                playerInput = playerInput.toLowerCase();

                int p = Integer.parseInt(playerInput);
                
                if (playerInput.equals("q")) {
                    System.out.println("Thanks for playing!");
                    break;
                }

                switch (playerInput) {
                    case "r" -> playerChoice = "Rock";
                    case "p" -> playerChoice = "Paper";
                    case "s" -> playerChoice = "Scissors";
                }

                if (playerChoice.equals("Rock") && computerChoice.equals("Rock")) {
                    System.out.println("The computer picks Rock.");
                    System.out.println("It's a tie!");
                    gameOver = true;
                } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
                    System.out.println("The computer picks Rock.");
                    System.out.println("Paper covers Rock.");
                    System.out.println("You win!");
                    gameOver = true;
                } else if (playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
                    System.out.println("The computer picks Rock.");
                    System.out.println("Rock crushes Scissors.");
                    System.out.println("You lose!");
                    gameOver = true;
                } else if (playerChoice.equals("Rock") && computerChoice.equals("Paper")) {
                    System.out.println("The computer picks Paper.");
                    System.out.println("Paper covers Rock.");
                    System.out.println("You lose!");
                    gameOver = true;
                } else if (playerChoice.equals("Paper") && computerChoice.equals("Paper")) {
                    System.out.println("The computer picks Paper.");
                    System.out.println("It's a tie!");
                    gameOver = true;
                } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
                    System.out.println("The computer picks Paper.");
                    System.out.println("Scissors cuts Paper.");
                    System.out.println("You win!");
                    gameOver = true;
                } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
                    System.out.println("The computer picks Scissors.");
                    System.out.println("Rock crushes Scissors.");
                    System.out.println("You win!");
                    gameOver = true;
                } else if (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) {
                    System.out.println("The computer picks Scissors.");
                    System.out.println("Scissors cuts Paper.");
                    System.out.println("You lose!");
                    gameOver = true;
                } else if (playerChoice.equals("Scissors") && computerChoice.equals("Scissors")) {
                    System.out.println("The computer picks Scissors.");
                    System.out.println("It's a tie!");
                    gameOver = true;
                }
            } catch (NumberFormatException e) { // TODO: Fix this
                System.out.println("Only letters allowed.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors");
        System.out.println(" ");
        System.out.println("Instructions:");
        System.out.println("Type 'r' for Rock, 'p' for Paper, or 's' for Scissors.");
        System.out.println("Type 'q' to quit.");

        playerVersusComputer();
    }
}
