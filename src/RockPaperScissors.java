void main() {
    Scanner in = new Scanner(System.in);
    boolean continuePlaying = true;

    do {
        // STEP 1: Get Player A Move
        String playerA = "";
        boolean validMoveA = false;
        do {
            System.out.print("Player A, enter your move [R, P, S]: ");
            playerA = in.nextLine();

            if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                validMoveA = true;
            } else {
                System.out.println("Invalid move! You must enter R, P, or S (or r, p, s).");
            }
        } while (!validMoveA);

        // STEP 2: Get Player B Move
        String playerB = "";
        boolean validMoveB = false;
        do {
            System.out.print("Player B, enter your move [R, P, S]: ");
            playerB = in.nextLine();

            if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                validMoveB = true;
            } else {
                System.out.println("Invalid move! You must enter R, P, or S (or r, p, s).");
            }
        } while (!validMoveB);

        // STEP 3: Compare Moves & Display Results
        if (playerA.equalsIgnoreCase("R")) {
            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock vs Rock it's a Tie!");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock - Player B wins!");
            } else { // playerB is "S"
                System.out.println("Rock breaks Scissors - Player A wins!");
            }
        } else if (playerA.equalsIgnoreCase("P")) {
            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock - Player A wins!");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper vs Paper it's a Tie!");
            } else { // playerB is "S"
                System.out.println("Scissors cuts Paper - Player B wins!");
            }
        } else { // playerA is "S"
            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors - Player B wins!");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper - Player A wins!");
            } else { // playerB is "S"
                System.out.println("Scissors vs Scissors it's a Tie!");
            }
        }

        // STEP 4: Prompt to Play Again [Y/N]
        String playAgain = "";
        boolean validPlayAgain = false;
        do {
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.nextLine();

            if (playAgain.equalsIgnoreCase("Y")) {
                validPlayAgain = true;
                continuePlaying = true;
            } else if (playAgain.equalsIgnoreCase("N")) {
                validPlayAgain = true;
                continuePlaying = false;
            } else {
                System.out.println("Invalid choice! Please enter Y or N.");
            }
        } while (!validPlayAgain);

        System.out.println();

    } while (continuePlaying);

    System.out.println("Game over. Thanks for playing!");
    in.close();
}
